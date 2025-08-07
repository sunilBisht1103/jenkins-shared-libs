def call(String project_name, String imagetag)
{
  sh "docker build -t ${project_name}:${imagetag} ."

}
