def call(String url, String branch) {
  git url: "${url}", branch: "${branch}"
  echo "Code cloned Successfully"
  sh "chmod +rwx ${workspace}/" //For changing the permission to be executable
}