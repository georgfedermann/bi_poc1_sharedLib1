import io.jenkins.pipeline.sample.SourceScript2

class SourceScript1 {
    def sourceScript1Method() {
        "sourceScript1 says hi" + " and " + new SourceScript2().sourceScript2Method()
    }
}
