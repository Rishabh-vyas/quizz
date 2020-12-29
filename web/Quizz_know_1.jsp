<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="TemplateMo">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="assets/css/stylee.css" />
    <link rel="stylesheet" href="assets/css/style_1.css">
    

    <title>Finance Business - Contact Page</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">

    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-finance-business.css">
    <link rel="stylesheet" href="assets/css/owl.css">

    
        <script src="http://www.fastlearning.in/controller/js/jquery-1.9.1.min.js"></script>
    
     <script type="text/javascript">
	$(document).ready(function() {
    $('label').click(function() {
        $('label').removeClass('worngans');
        $(this).addClass('worngans');
    });
});
	</script>
        
  </head>

  <body>

    <!-- ***** Preloader Start ***** -->
    <div id="preloader">
        <div class="jumper">
            <div></div>
            <div></div>
            <div></div>
        </div>
    </div>  
    <!-- ***** Preloader End ***** -->
    

    

    <%@include file="blocks/Lofin_after_header.jsp" %>
   
    <!-- Page Content -->
    <div class="page-heading header-text">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1>Space,ISRO,NASA</h1>
            <span>Ready</span>
          </div>
        </div>
      </div>
    </div>

    <!--------------------------------------------------------->
    
    
    <div id="container">
        <div id="start">Ready To Start !</div>
        <div id="quiz" style="display: none">
            <div id="question"></div>
            <div id="qImg"></div>
            <div id="choices">
                <div class="choice" id="A" onclick="checkAnswer('A')"></div>
                <div class="choice" id="B" onclick="checkAnswer('B')"></div>
                <div class="choice" id="C" onclick="checkAnswer('C')"></div>
            </div>
            <div id="timer">
                <div id="counter"></div>
                <div id="btimeGauge"></div>
                <div id="timeGauge"></div>
            </div>
            <div id="progress"></div>
        </div>
        <div id="scoreContainer" style="display: none"></div>
    </div>
    
    
    <!--------------------------------------------------------->
    
    
<br><br><br>
<%@include file="blocks/footer.jsp" %>
    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Additional Scripts -->
    <script src="assets/js/custom.js"></script>
    <script src="assets/js/owl.js"></script>
    <script src="assets/js/slick.js"></script>
    <script src="assets/js/accordions.js"></script>

    <script language = "text/Javascript"> 
      cleared[0] = cleared[1] = cleared[2] = 0; //set a cleared flag for each field
      function clearField(t){                   //declaring the array outside of the
      if(! cleared[t.id]){                      // function makes it static and global
          cleared[t.id] = 1;  // you could use true and false, but that's more typing
          t.value='';         // with more chance of typos
          t.style.color='#fff';
          }
      }
    </script>

    
    
    
            <script>
            // select all elements
const start = document.getElementById("start");
const quiz = document.getElementById("quiz");
const question = document.getElementById("question");
const qImg = document.getElementById("qImg");
const choiceA = document.getElementById("A");
const choiceB = document.getElementById("B");
const choiceC = document.getElementById("C");
const counter = document.getElementById("counter");
const timeGauge = document.getElementById("timeGauge");
const progress = document.getElementById("progress");
const scoreDiv = document.getElementById("scoreContainer");
const showMark=document.getElementById("")

// create our questions
var questions = [
    {
        question : "1. Who is said to be the Father of the Indian Space Program ?",
        imgSrc : "assets/images/space.png",
        choiceA : "Prof Satish Dhawan",
        choiceB : "Dr. A P J Abdul Kalam",
        choiceC : "Dr. Vikram A Sarabhai",
        correct : "C"
    },{
        question : "2. Which of these is not a launch vehicle of the Indian Space Research Organisation (ISRO)?",
        imgSrc : "assets/images/space.png",
        choiceA : "ASLV",
        choiceB : "HSLV",
        choiceC : "PSLV",
        correct : "B"
    },{
        question : "3. IRS series satellites are used for?",
        imgSrc : "assets/images/space.png",
        choiceA : "Forestry",
        choiceB : "Astronomy",
        choiceC : "RemoteSensing",
        correct : "C"
    },{
        question : "4. Which is India's first artificial satellite?",
        imgSrc : "assets/images/space.png",
        choiceA : " Aryabhatta",
        choiceB : "Rohini",
        choiceC : "INSAT",
        correct : "A"
    },{
        question : "5. Who was the Chairman of ISRO from 1994 to 2003?",
        imgSrc : "assets/images/space.png",
        choiceA : "Dr. K Kasturirangan",
        choiceB : "Prof U R Rao",
        choiceC : "Prof Satish Dhawan",
        correct : "A"
    },{
        question : "6. TES (Technology Experimental Satellite) is India's first Defence satellite?",
        imgSrc : "assets/images/space.png",
        choiceA : "True",
        choiceB : "False",
        correct : "A"
    },{
        question : "7. Who was the backup crew for Rakesh Sharma, the first Indian in space?",
        imgSrc : "assets/images/space.png",
        choiceA : "Madhavan Nair",
        choiceB : " Ravi Kumar",
        choiceC : "Ravish Malhotra",
        correct : "C"
    },{
        question : "8. On which spacecraft did Rakesh Sharma make his historic trip to space?",
        imgSrc : "assets/images/space.png",
        choiceA : "Soyuz-T11",
        choiceB : "Apollo 11",
        choiceC : "Salyut 7",
        correct : "C"
    },{
        question : "9. METSAT the first exclusive meteorological satellite built by ISRO is a?",
        imgSrc : "assets/images/space.png",
        choiceA : " Polar Orbit Satellite",
        choiceB : "Geosynchronous Satellite",
        choiceC : "Low Earth Orbit Satellite",
        correct : "B"
    },{
        question : "10. The experimental satellite SROSS abbreviation means?",
        imgSrc : "assets/images/space.png",
        choiceA : " Subcontracted Rohini Satellite Series",
        choiceB : "Subsystem Rohini Satellite Series",
        choiceC : "Stretched Rohini Satellite Series",
        correct : "C"
    }
    
];

// create some variables

const lastQuestion = questions.length - 1;
let runningQuestion = 0;
let count = 0;
const questionTime = 10; // 10s
const gaugeWidth = 150; // 150px
const gaugeUnit = gaugeWidth / questionTime;
let TIMER;
let score = 0;

// render a question
function renderQuestion(){
    let q = questions[runningQuestion];
    
    question.innerHTML = "<p>"+ q.question +"</p>";
    qImg.innerHTML = "<img src="+ q.imgSrc +">";
    choiceA.innerHTML = q.choiceA;
    choiceB.innerHTML = q.choiceB;
    choiceC.innerHTML = q.choiceC;
}

start.addEventListener("click",startQuiz);

// start quiz
function startQuiz(){
    start.style.display = "none";
    renderQuestion();
    quiz.style.display = "block";
    renderProgress();
    renderCounter();
    TIMER = setInterval(renderCounter,1000); // 1000ms = 1s
}

// render progress
function renderProgress(){
    for(let qIndex = 0; qIndex <= lastQuestion; qIndex++){
        progress.innerHTML += "<div class='prog' id="+ qIndex +"></div>";
    }
}

// counter render

function renderCounter(){
    if(count <= questionTime){
        counter.innerHTML = count;
        timeGauge.style.width = count * gaugeUnit + "px";
        count++
    }else{
        count = 0;
        // change progress color to red
        answerIsWrong();
        if(runningQuestion < lastQuestion){
            runningQuestion++;
            renderQuestion();
        }else{
            // end the quiz and show the score
            clearInterval(TIMER);
            scoreRender();
        }
    }
}

// checkAnwer

function checkAnswer(answer){
    if( answer == questions[runningQuestion].correct){
        // answer is correct
        score++;
        // change progress color to green
        answerIsCorrect();
    }else{
        // answer is wrong
        // change progress color to red
        answerIsWrong();
    }
    count = 0;
    if(runningQuestion < lastQuestion){
        runningQuestion++;
        renderQuestion();
    }else{
        // end the quiz and show the score
        clearInterval(TIMER);
        scoreRender();
    }
}

// answer is correct
function answerIsCorrect(){
    document.getElementById(runningQuestion).style.backgroundColor = "#0f0";
}

// answer is Wrong
function answerIsWrong(){
    document.getElementById(runningQuestion).style.backgroundColor = "#f00";
}

// score render
function scoreRender(){
    scoreDiv.style.display = "block";
    
    // calculate the amount of question percent answered by the user
    var scorePerCent = Math.round(100 * score/questions.length);
        <%
            
        %>
    // choose the image based on the scorePerCent
    
    let img = (scorePerCent >= 80) ? "assets/images/5.png" :
              (scorePerCent >= 60) ? "assets/images/4.png" :
              (scorePerCent >= 40) ? "assets/images/3.png" :
              (scorePerCent >= 20) ? "assets/images/2.png" :
              "assets/images/1.png";
    
    scoreDiv.innerHTML = "<img src="+ img +">";
    scoreDiv.innerHTML += "<p>"+ scorePerCent +"%</p>";
    
    
    let marksGotByUser=scoreRender();
}
</script>

  </body>
</html>