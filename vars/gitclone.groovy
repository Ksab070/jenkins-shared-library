def call(String url, String branch) {
  git url: "${url}", branch: "${branch}"
  //Take parameter during the build phase, perform git url on this
  echo "Code cloned Successfully"
  sh "chmod +rwx ${workspace}/"
  //For changing the permission to be executable
}