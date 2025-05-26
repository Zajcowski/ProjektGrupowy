package com.oliwiatrojniak.saveapenny.presets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PresetsService {

  PresetRepository PresetRepository;

  @Autowired
  public PresetsService(PresetRepository PresetRepository) {
    this.PresetRepository = PresetRepository;
  }
  PresetDto addToPresets(AddPreset newPreset){
    Preset Preset = new Preset(newPreset.name, newPreset.price, newPreset.quantity, newPreset.category);
    PresetRepository.save(Preset);
    return Preset.convertToDto();
  }

  void deleteFromPresets(DeletePreset toDeletePreset){
    PresetRepository.deleteById(toDeletePreset.id);
  }

  PresetDto findPreset(Long id) {
    final Optional<Preset> foundPreset = PresetRepository.findById(id);
    if (foundPreset.isPresent()) {
      return foundPreset.get().convertToDto();
    } else {
      throw new PresetNotFound(id.toString());
    }
  }

  List<PresetDto> showPresets() {
    return PresetRepository.findAll().stream()
        .map(Preset -> Preset.convertToDto())
        .collect(Collectors.toList());
  }

}
