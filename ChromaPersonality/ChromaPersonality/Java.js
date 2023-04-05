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
    

function Result ()

{
    window.open("result.html");
    
    
      

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
  
}

   
function highestcolor(value)
{  
 if(value == gold)
 {
  window.location.href ='Gold.html';
   
 }
 
else if(value == blue)
 {
  window.location.href ='Blue.html';
 }
else if(value == green)
 {
  window.location.href ='Green.html';
 }
else if (value == orange)
 {
  window.location.href ='Orange.html';
 }
   }

  function sechighest(value)
{
if(value == gold)
{
  window.location.href ='Gold.html';
}

else if(value == blue)
{
  window.location.href ='Blue.html';
}
else if(value == green)
{
  window.location.href ='Green.html';
}
else if(value == orange)
{
  window.location.href ='Orange.html';
}
}
 
 
 
 