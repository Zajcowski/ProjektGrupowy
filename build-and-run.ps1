# Remove other images // WARNING - REMOVES ALL UNUSED IMAGES
docker container prune -f
docker image prune -af
docker volume prune -af

# Build backend with Maven
./mvnw clean package -DskipTests

# Remove old frontend build and node_modules
cd ../ProjektGrupowyFront
Remove-Item -Recurse -Force node_modules, dist

# Install frontend dependencies and build
npm install
npm run build

# Build frontend Docker image
docker build --no-cache -t frontsavepenny:latest .

# Go back to backend root or docker-compose folder (adjust as needed)
cd ../ProjektGrupowy

# Start all services
docker compose up -d --force-recreate --renew-anon-volumes