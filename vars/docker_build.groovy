// Define function
def call(String ProjectName, String ImageTag){
  sh "DOCKER_BUILDKIT=0 docker build -t ${ProjectName}:${ImageTag} ."
}
