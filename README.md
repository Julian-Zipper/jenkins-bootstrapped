# Jenkins Bootstrapped

A Version-Controlled Base for Jenkins Instances.

- designed for use in multiple projects
- Convenient way to learn Jenkins, Pipelines & Gradle


### Versions

The master branch is a simple jenkins instance base for automatically creating jobs. To use this repository alongside the cicd-demo repo, select the corresponding branch first: `git checkout recipe-job`

### Running Jenkins

1. `./gradlew docker dockerRun`
2. Open the Jenkins instance - It'l be available on [http://localhost:8080](http://localhost:8080)
3. Run the seed Job to automatically create the necessary pipeline(s)
4. Build the pipeline Job (`recipeJob` in the case of the ci-cd demo)
