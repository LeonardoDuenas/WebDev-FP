let gold = 0;
let blue = 0;
let green = 0;
let orange = 0;
let highest = 0;
let highest2 = 0;


function Gold (value)
    {
        if (value == 4)
        {
            gold += 4;
        }
        else if (value == 3)
        {
            gold += 3;
        }
        else if (value == 2)
        {
            gold += 2;
        }
        else (value == 1)
        {
            gold += 1;
        }


    }

    function Blue (value)
    {
        if (value == 4)
        {
            blue += 4;
        }
        else if (value == 3)
        {
            blue += 3;
        }
        else if (value == 2)
        {
            blue += 2;
        }
        else (value == 1)
        {
            blue += 1;
        }

      
     
    }
    
    function Green (value)
    {
        if (value == 4)
        {
            green += 4;
        }
        else if (value == 3)
        {
            green += 3;
        }
        else if (value == 2)
        {
            green += 2;
        }
        else if (value == 1)
        {
            green += 1;
        }

       
      
     
    }


    function Orange (value)
    {
        if (value == 4)
        {
            orange += 4;
        }
        else if (value == 3)
        {
            orange += 3;
        }
        else if (value == 2)
        {
            orange += 2;
        }
        else if (value == 1)
        {
            orange += 1;
        }


       
      
    }
    

function Result (sheet1, sheet2)
{
  document.getElementById('questionnaire').setAttribute('href', sheet1);
  document.getElementById('main').setAttribute('href', sheet2);
  var div = document.getElementById('form');
  var div2 = document.getElementById('result_container');
  
    div.style.display = 'none';

  
    div2.style.display = 'block';

  

  window.sessionStorage.setItem('orange', orange.toString());
      window.sessionStorage.setItem('green', green.toString());
      window.sessionStorage.setItem('blue', blue.toString());
      window.sessionStorage.setItem('gold', gold.toString());
   
    

      if (gold > highest) {
        highest = gold;
      }
      
      if (blue > highest) {
        highest = blue;
      }
      
      if (green > highest) {
        highest = green;
      }
      
        if (orange > highest) {
        highest = orange;
      }
      // Call the function with the highest value
      if (gold < highest && gold > highest2) {
        highest2 = gold;
      }

     if (blue < highest && blue > highest2) {
        highest2 = blue;
      }
     if (green < highest && green > highest2) {
        highest2 = green;
      }
     if (orange < highest && orange > highest2) {
        highest2 = orange;
      }
      
      
      // Retrieve the number from localStorage
    
      

}

   
function highestcolor()
{  
  
  if(highest == gold)
  {
    window.location.href ='Gold.html';
  }
  else if(highest == blue)
  {
    window.location.href ='Blue.html';
  }
  else if(highest == green)
  {
    window.location.href ='Green.html';
  }
  else if(highest == orange)
  {
    window.location.href ='Orange.html';
  }
   }

  function sechighest()
{
    if(highest2 == gold)
    {
      window.location.href ='Gold.html';
    }
    else if(highest2 == blue)
    {
      window.location.href ='Blue.html';
    }
    else if(highest2 == green)
    {
      window.location.href ='Green.html';
    }
    else if(highest2 == orange)
    {
      window.location.href ='Orange.html';
    }
}
 
 
const menu = document.querySelector('#mobile-menu');
const menuLinks = document.querySelector('.navbar__menu');

menu.addEventListener('click', function() {
  menu.classList.toggle('is-active');
  menuLinks.classList.toggle('active');
});
 
 
