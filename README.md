# Acolite

An Assisstive Software for Colorblind People using Chromatic Adaptation Transform and Daltonization Algorithm

### Files

```
Acolite.java
```

This is the main class of the system and where Chromatic Adaptation Transform happens. 

```
AboutPanel.java
```

This is where you'll find the GUI for the "About" option of the software.

```
ImageDisplay.java
```

This class displays the recolored image. 

```
ImageDisplayWithPanel.java
```

This class displays the recolored image with the panel and extends ImageDisplay.

```
MainWindow.java
```

It displays the MyDeficiency window in order for the coorblind user to input the values needed to determine the appropriate screen filter.

```
MyDeficiency.java
```

This is where the values determined by the D-15 Farnsworth test was analyzed in order for the system to know the apprpriate screen filter to apply. 

```
Screen.java
```

This determines the Graphics Environment of the screen area to be filtered and recolored.

```
Simulator.java
```

This is where the Daltonization algorithm takes place and calculates the color shifted RGB values. 

### Prerequisites

What things you need to install the software 

* [Java SE Runtime Evironment](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html) - version 8 or higher

* Windows OS - Windows 8 or higher

* Intel Core i3 Processor or higher

### Installing

* Make sure that the prerequisites to run the program are installed and working.

* Double click on the ".exe" file to execute the program.

### How to Operate the System

* After running the program, its icon can be found at icon tray located at the right side of the task bar.

* Right-click on Acolite's icon in order to see its menu.

* If the user haven't taken the Farnsworth D-15 Test yet, click on the "Take D-15 dichotomous test" option to take the test.

* Upon knowing the values determined by the Farnsworth D-15 Test, specifically the Angle, TES, S-Index and C-Index, click on the "My Deficiency" option.

* Input the values needed: Angle, TES, S-Index and C-Index.

* Click on the "Apply Screen Filter" button to apply the filter.

* To refresh the screen, click on the "My Deficiency" button. 

* To reapply the screen color filter, right-click on the system icon, choose the "My Deficiency" option and click on the "Apply Screen Filter" button.

## Authors

* **Ellis Evangelista** - *Initial work* - [ellisevangelista](https://github.com/ellisevangelista)
* **Alyssa Talens** - *Initial work* - [alyssavenice](https://github.com/alyssavenice)
* **Marionne Gloria** - *Initial work* - [marionnegloria](https://github.com/marionnegloria)
* **Jenella Mangaliag** - *Initial work* - [jenellamae](https://github.com/jenellamae)

## License
This project is licensed under the MIT License - see the [LICENSE.txt](LICENSE.txt) file for details
