/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnCrypto;

/**
 *
 * @author Sai-PC
 */
public class Crypto {
public char retEncrypt(char ch,int key)
{
 
    
//    if((int)ch>=120)
//  {
//   ch=(char) (96+((ch+3)%122));
//  }
//  else
//   ch=(char) (ch+3%122);
//    
//    return  ch;
    
    
    if(ch >= 'a' && ch <= 'z')
    {
	            ch = (char)(ch + key);
	            
	            if(ch > 'z'){
	                ch = (char)(ch - 'z' + 'a' - 1);
	            }
	            return ch;
    }
    else if(ch >= 'A' && ch <= 'Z')
    {
	            ch = (char)(ch + key);
	            
	            if(ch > 'Z'){
	                ch = (char)(ch - 'Z' + 'A' - 1);
	            }
	            return ch;
    }
    else 
    {
	        	return ch;
    }
	              
}

public char retDecrypt(char ch,int key)
{
 
    
//    if((int)ch>=120)
//  {
//   ch=(char) (96+((ch-3)%122));
//  }
//  else
//   ch=(char) (ch-3%122);
//    
//    return  ch;
//}
    if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'a'){
	                ch = (char)(ch + 'z' - 'a' + 1);
	            }
	            
	            return ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'A'){
	                ch = (char)(ch + 'Z' - 'A' + 1);
	            }
	            
	            return ch;
	        }
	        else {
	        	return ch;
	        }

}

}
