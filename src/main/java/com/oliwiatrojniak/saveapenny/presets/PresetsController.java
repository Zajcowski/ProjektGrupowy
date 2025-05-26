package com.oliwiatrojniak.saveapenny.presets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/presets")
class PresetsController {

  private final PresetsService service;

  @Autowired
  public PresetsController(PresetsService service) {
    this.service = service;
  }

  @PostMapping("/add")
  public PresetDto addToPresets(@RequestBody AddPreset newPreset) {
    return service.addToPresets(newPreset);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteFromPresets(@PathVariable long id) {
    service.deleteFromPresets(new DeletePreset(id));
  }

  @GetMapping("/{id}")
  public PresetDto findPreset(@PathVariable long id) {
    return service.findPreset(id);
  }

  @GetMapping("/")
  public List<PresetDto> showPresets() {
    return service.showPresets();
  }

}
