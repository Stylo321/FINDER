IMAD 5112 ESSAY
The Process of finishing my Application.
This essay will be explaining how  I went about creating my mobile application for my assignment using Android Studio and the programming language(Kotlin).This essay will provide many details on most of the code and all of the challenges that I had encountered.
Reading my assignment for the first time the only thing I understood was the User Interface(UI).Realizing that I knew the bare minimum I had to learn and study the basics and all the necessary information that I will need to make my app successful, Time was running out so I had to work with what I knew which was the User Interface. The first step in creating my user Interface(UI) was to click and drag “PlainText” onto the UI because that will be where the user types in their input. Usually the identification for the component(PlainText) would be “EditTextText”…you might need to change the ID to something of your preference and to something you’ll remember like “input” or “Text_Entered”.Changing the id of a component will require you to refactor, after this is done you’ll notice that on activity main the id code has changed to whatever you refactored it to be.
Still building the User Interface you’ll need to drag a Button and place it wherever you want it to be and undergo the same process done when placing and refactoring “PlainText” .In context of my application the 1st button was refactored to “check_name_button” .Adding to the User Interface a 2nd button needs to be added to the user interface this time it’s id needs to be refactored to “clear_button” because the id of the same component cannot have the same, if it is it will count as one since you gave it one identity that’s why it is important to ID your components in ways that are relevant, make sense and most importantly different to each other.
At this stage of the Application there is a component to type in the input(Text_Entered)and two buttons one of which is to clear the input and the other button to generate the result needed but there is no component added as yet to show the results(output).Drag Text view , place it where it is necessary and change the ID to a name or phrase that makes sense and is relevant like “display”, “result”or “Display_Result”. Text view is where the answers will show.
Once all of the ID’s for the components have been refactored to a more relevant ID you’ll need to add constraints to all sides of the components so that everything wont float or  compact  to ne side of the screen when running the app,it keeps it in a fixed position of your liking. Every component added to the User Interface (UI) has its own code in the code section of activity_main and  you can customize the sizes of texts in each components (eg:by typing the code Android:textsize: “23sp” )this works with the components that have text. At this stage you have all the components put in and constrained you can look into how to insert the background and changing the colours of the buttons. The first thing that needs to be done is going online and searching wallpapers, in this case “history themed wallpapers”. It is important to download wallpapers compatible with mobile phones since this app is a mobile applications and the measurements (height & width) of the background will be precise and in proportion to all mobile devices. Once the photo is downloaded you’ll need to save it on a a folder that you’ll remember so it will be easier to find when on Android Studio. While on Android studio you go to project manager and on the the far to left there will be a “+” sign that youll press and “import  values” will show up after that youll  have to go to the folder in which you saved that image in, once the image is found you’ll need  to import it and it should show in the drawables folder under “res”. From the first few lines of code in activity_main you’ll  required to write this code “android: background:@drawables/”…”),after the forward slash there will be options that pop up and from those options you’ll need to pick the name you saved the picture as, the background sould be filled with the selected picture. An alternate  way is  after you’ve imported your image in the drawables folder and written  (android:background:@drawables “”) you can click,drag &drop the image to the code in activity_main between “”
 To change the button colours you’ll need to type in the code (android:background Tint:.. )after typing this a variety of options will sow and you’ll have to make a chose of which cololour do you prefer.
For Main Activity the first thing you need to do is to declare everything that you inserted in your User Interface from your Edit_Text to your Text_View the way of declaring is 
“ val componentID =  findViewById<component heading>(R.id.componentID)” since declaring is used to announce the existence of the entity to the compiler is it important that we acknowledge that we have added components to the app. Main Activity deals with the logic, instruction and functioning of an app. After all declarations are done then you need to focus on giving instructions to the respective components like the two button’s. The format of the button that clears text from the input(Clear_Button) is
buttonID.setOnClickListener{inputID.text.clear()}  this is the logic and instruction to clear text from the input(text_entered).
Now that one button has been given an instruction to clear text , the second button needs to be given the instruction to generate whatever it needs to generate.The format of the button that Generates history from the input(text_entered ) is 
buttonID.setOnClickListerner{
val inputID = inputID.text.toString()
)
The last step in fully creating my functioning app is figuring out what logic do I need to use in order to link  a certain age with the death of a famous person that past away at that age.It took a while to figure it out because there were a ton of ways to code what was needed.There was a class activity in class that  I did which was about an if&else statement.I had to Relearn and master the code because it seemed like it would work,after I understood how to do the If/else statement I created a simple app on a new activity with a (Input,Button and Text view),I inserted the code for the if /else statement with text that would correspond.The app was successful and I knew that I had a long way to go since I had to code 80 people for it to be a proper app. 
The format for the if/else statement is :
If (InputID == “”) {
    TextView.text = “”
}
If else (InputID == “”) {
              TextView.text = “”
}
Else (InputID ==  “”) {
           TextView.text = “”
}
In conclusion, this app was very challenging at first but as I progressed and worked though the assignment I realized that I know more than I thought I knew and the assignment became easier as I was doing it. Most applications done in class were very helpful because if it wasn’t for those class activities that were done in class it would have been difficult or me to figure out what code is required.

MY SCREENSHOT OF MY USER INTERFACE
![Screenshot (4)](https://github.com/Stylo321/FINDER/assets/165194260/0c742817-8c70-46fa-b40b-fb54bb605ece)

MY YOUTUBE LINK
- https://youtu.be/0B2fn3EZisA?si=zFUccNG1S6wZdhle


REFERENCE LIST


Kotlin if Statements in Android - Pete Grapentien.2018. YouTube video,added by Pete Grapentein.[Online].Available at https://youtu.be/2qtr41p5bdY?si=D7clhBEJcHQd-Rne[Accessed 25 March 2024]
 

09-Kotlin for beginners:Add Comments - Code Kotlin.2017.YouTube video,added by Code Kotlin.[Online].Available at /https://youtu.be/ht-5C-G_X91?si=VEQfmmYN7c045yfk [Accessed 25 March 2024]
