package com.teamtter.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.project.MavenProject;

import lombok.extern.slf4j.Slf4j;

@Mojo(name = "print", /** the goal */
	threadSafe = true,
	defaultPhase = LifecyclePhase.VALIDATE,
	requiresDependencyResolution = ResolutionScope.NONE,
	requiresProject = false,
	aggregator=true)
@Slf4j
public class PrintDummyMojo extends AbstractMojo {

	@Parameter(defaultValue = "${project}", readonly = true)
	private MavenProject mavenProject;

	@Parameter(property = "rootDirectory", defaultValue = "${project.basedir}") // alternative: use "session.executionRootDirectory"
	private File rootDirectory;

	@Parameter(property = "skip", defaultValue = "false")
	private boolean skip;

	@Parameter(property = "failOnError", defaultValue = "true")
	private boolean failOnError;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		if (skip) {
			log.info(this.getClass().getSimpleName() + " :: skipping execution due to 'skip' == true");
		} else {
			getLog().info("Dummy mojo !!!");
		}
	}

}
