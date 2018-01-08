
= What is this Maven plugin

it's a dummy plugin printing "Dummy !" on the screen

= How to use

On the command line run: 

[source,xml]
-------------------------------------------

<plugins>
	<plugin>
		<groupId>com.teamtter.maven</groupId>
		<artifactId>print-dummy-maven-plugin</artifactId>
		<executions>
			<execution>
				<id>validateI18N</id>
				<goals>
					<goal>print</goal>
				</goals>
			</execution>
		</executions>
		<configuration>
		</configuration>
		<inherited>false</inherited>
	</plugin>
	
	[...]
</plugins>

-------------------------------------------

