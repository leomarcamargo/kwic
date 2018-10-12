# Key Word in Context - Software Product Line
"**KWIC** is an acronym for **Key Word In Context**, the most common format for concordance lines. The term KWIC was first coined by Hans Peter Luhn. The system was based on a concept called keyword in titles which was first proposed for Manchester libraries in 1864 by Andrea Crestadoro. A KWIC index is formed by sorting and aligning the words within an article title to allow each word (except the stop words) in titles to be searchable alphabetically in the index. It was a useful indexing method for technical manuals before computerized full text search became common" [[1](https://en.wikipedia.org/wiki/Key_Word_in_Context)].

### Features
The features present in this repository are:

![Feature Model](https://i.imgur.com/tBVxcmy.png)

# Steps to Generate a Product
To run this project it is necessary to use the [Eclipse IDE](https://www.eclipse.org/downloads/). For the project to work, make sure that you have the following components installed:

### Delta-Oriented Programming 
1. Open the Eclipse IDE and go to **Help -> Install New Software** and install the [DeltaJ 1.5](https://www.tu-braunschweig.de/isf/research/deltas/) plugin: https://www.isf.cs.tu-bs.de/cms/research/deltas/downloads/plug-in.

2. With the DeltaJ plugin installed, import the project into the Eclipse IDE: <br />
2.1. **File -> Import -> Existing Projects Into Workspace**;

3. Open the **Project Explorer** and go to **spl-info -> KwicDeltaJ.spl**;

4. Go to menu **Project -> Clean**. After that, it will open a DeltaJ Plugin window so that a product is generated: <br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![DeltaJ Products do select](https://i.imgur.com/VFlPlIr.png)

### Conditional Compilation
1. Install and configure the [Hepheatus](https://github.com/hephaestus-pl/hephaestus-base);

2. In the directory for this project, open the **spl-config** folder. Then open the file **project.properties** and replace the *&lt;path-where-this-repository-is-cloned&gt;* tag as requested. <br />
2.1. Then change the value of * instance-model * to the desired product;

3. Open the workspace where the Hepheastus tool is installed. Then go to **hephaestus-sb/bin** and run the *hepheastus* file. <br />
3.1. After running hephaestus, the following screen will appear: <br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![Hephaestus Tool](https://i.imgur.com/xDusiZY.png)

4. Enter the command *start*. Then enter the **absolute path** where the *project.properties* file is located and then confirm;

5. Navigate to the target directory that was entered in the *projects.properties* file.

6. Open the terminal and enter the command below. Remember to replace *&lt;hephaestus-workspace-path&gt;* with its corresponding value: <br /> *java -jar &lt;hephaestus-workspace-path&gt;/hephaestus-pp/bin/antenna-pp.jar files.pp build.lst --drop-lines*

### Acknowledgment

Thanks to José Fortes for having implemented the [initial version of KWIC](https://github.com/zfortes/KWIC) in Java and later in DeltaJ.

