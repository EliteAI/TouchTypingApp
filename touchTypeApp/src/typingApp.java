import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
* <h1>touch type application</h1>
*
*This program will serve as a touch type application
*which will utilize a GUI for the user to see
*what they are typing.
*
* @author Nick Mason j.r
* @version 1.0
* @since 2019-10-11
*/


public class typingApp 
{
	private JFrame tpFrame;
	private String pangramOne = "The quick brown fox jumps over a lazy dog <--------- Type this sentence as quickly as possible. Your time will be recorded.";
	private Timer timer = new Timer();
	static int xSeconds = 0;
	static JLabel timeStamp = new JLabel();
	
	public static void main(String args[])
	{
		/*This method will serve as the main.
		 * and will invoke a runnable event
		 */
		
		try
		{
		EventQueue.invokeLater(new Runnable()
				 {
			
				 @Override
			public void run()
			{
				try
				       {
					
					
	    
					typingApp window = new typingApp();
					
					window.tpFrame.setVisible(true);
					
				       } 
				     
				catch (Exception e)
				    {
					e.printStackTrace();
				    }
			}


	
				  });
		}
		
		catch(Exception e)
		{
			System.out.println("Main program execution failed.");
		}
	}
	
public typingApp()
{
/*This method will serve as a constructor 
 * for the typingApp() class.
 */
	init();
}




public void init()
{
	/*This method will serve to define the initialize function for the touch
	 * typing application. Creating the buttons and their functionalities.
	 * It will also create the text area and set the wrap style.
	 */
	
	
	tpFrame = new JFrame();
	

	tpFrame.setTitle("Touch Typing Tool");
	tpFrame.setBounds(450,450,1000,800);
	tpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tpFrame.getContentPane().setLayout(null);
	
	
	JLabel helper = new JLabel("Try typing some text using your keyboard. Keys will be highlight and your words displayed.");
	helper.setFont(new Font("arial", Font.BOLD,12));
	helper.setBounds(150,-120,900,400);
	tpFrame.getContentPane().add(helper);
	
	JLabel note = new JLabel("Mouse click disabled");
	note.setFont(new Font("arial", Font.ITALIC, 12));
	note.setBounds(340, 45, 900, 400);
	tpFrame.getContentPane().add(note);
	
	
	final JButton specialB = new  JButton("`");
	specialB.setBounds(32,400,50,51);
	tpFrame.getContentPane().add(specialB);
	
	
	final JButton oneB = new  JButton("1");
	oneB.setBounds(83,400,50,51);
	tpFrame.getContentPane().add(oneB);
	
	final JButton twoB = new  JButton("2");
	twoB.setBounds(134,400,50,51);
	tpFrame.getContentPane().add(twoB);
	
	final JButton threeB = new  JButton("3");
	threeB.setBounds(185,400,50,51);
	tpFrame.getContentPane().add(threeB);
	
	final JButton fourB = new  JButton("4");
	fourB.setBounds(236,400,50,51);
	tpFrame.getContentPane().add(fourB);
	
	
	final JButton fiveB = new  JButton("5");
	fiveB.setBounds(287,400,50,51);
	tpFrame.getContentPane().add(fiveB);
	
	final JButton sixB = new  JButton("6");
	sixB.setBounds(338,400,50,51);
	tpFrame.getContentPane().add(sixB);
	
	final JButton sevenB = new  JButton("7");
	sevenB.setBounds(389,400,50,51);
	tpFrame.getContentPane().add(sevenB);
	
	
	final JButton eightB = new  JButton("8");
	eightB.setBounds(440,400,50,51);
	tpFrame.getContentPane().add(eightB);
	
	final JButton nineB = new  JButton("9");
	nineB.setBounds(491,400,50,51);
	tpFrame.getContentPane().add(nineB);
	
	
	final JButton zeroB = new  JButton("0");
	zeroB.setBounds(542,400,50,51);
	tpFrame.getContentPane().add(zeroB);
	
	
	final JButton dashB = new  JButton("-");
	dashB.setBounds(593,400,50,51);
	tpFrame.getContentPane().add(dashB);
	
	
	final JButton plusB = new  JButton("=");
	plusB.setBounds(644,400,50,51);
	tpFrame.getContentPane().add(plusB);
	
	
	final JButton backB = new  JButton("BACKSPACE");
	backB.setBounds(695,400,205,51);
	tpFrame.getContentPane().add(backB);
	
	
	final JButton tabB = new  JButton("TAB");
	tabB.setBounds(32,451,133,51);
	tpFrame.getContentPane().add(tabB);
	
	final JButton qB = new  JButton("Q");
	qB.setBounds(166,451,50,51);
	tpFrame.getContentPane().add(qB);
	
	final JButton wB = new  JButton("W");
	wB.setBounds(217,451,50,51);
	tpFrame.getContentPane().add(wB);
	
	final JButton eB = new  JButton("E");
	eB.setBounds(268,451,50,51);
	tpFrame.getContentPane().add(eB);
	
	final JButton rB = new  JButton("R");
	rB.setBounds(319,451,50,51);
	tpFrame.getContentPane().add(rB);
	
	final JButton tB = new  JButton("T");
	tB.setBounds(370,451,50,51);
	tpFrame.getContentPane().add(tB);
	
	final JButton yB = new  JButton("Y");
	yB.setBounds(421,451,50,51);
	tpFrame.getContentPane().add(yB);
	
	final JButton uB = new  JButton("U");
	uB.setBounds(472,451,50,51);
	tpFrame.getContentPane().add(uB);
	
	final JButton iB = new  JButton("I");
	iB.setBounds(523,451,50,51);
	tpFrame.getContentPane().add(iB);
	
	final JButton oB = new  JButton("O");
	oB.setBounds(574,451,50,51);
	tpFrame.getContentPane().add(oB);
	
	final JButton pB = new  JButton("P");
	pB.setBounds(625,451,50,51);
	tpFrame.getContentPane().add(pB);
	
	final JButton leftCB_B = new  JButton("[");
	leftCB_B.setBounds(676,451,50,51);
	tpFrame.getContentPane().add(leftCB_B);
	
	final JButton rightCB_B = new  JButton("]");
	rightCB_B.setBounds(727,451,50,51);
	tpFrame.getContentPane().add(rightCB_B);
	
	final JButton slashB = new  JButton("|");
	slashB.setBounds(778,451,122,51);
	tpFrame.getContentPane().add(slashB);
	
	final JButton capsB = new  JButton("CAPS LOCK");
	capsB.setBounds(32,505,143,51);
	tpFrame.getContentPane().add(capsB);
	
	final JButton aB = new  JButton("A");
	aB.setBounds(176,505,50,51);
	tpFrame.getContentPane().add(aB);
	
	final JButton sB = new  JButton("S");
	sB.setBounds(227,505,50,51);
	tpFrame.getContentPane().add(sB);
	
	
	final JButton dB = new  JButton("D");
	dB.setBounds(278,505,50,51);
	tpFrame.getContentPane().add(dB);
	
	
	final JButton fB = new  JButton("F");
	fB.setBounds(329,505,50,51);
	tpFrame.getContentPane().add(fB);
	
	
	final JButton gB = new  JButton("G");
	gB.setBounds(380,505,50,51);
	tpFrame.getContentPane().add(gB);
	
	final JButton hB = new  JButton("H");
	hB.setBounds(431,505,50,51);
	tpFrame.getContentPane().add(hB);
	
	
	final JButton jB = new  JButton("J");
	jB.setBounds(482,505,50,51);
	tpFrame.getContentPane().add(jB);
	
	
	final JButton kB = new  JButton("K");
	kB.setBounds(533,505,50,51);
	tpFrame.getContentPane().add(kB);
	
	
	final JButton lB = new  JButton("L");
	lB.setBounds(584,505,50,51);
	tpFrame.getContentPane().add(lB);
	
	final JButton semiB = new  JButton(";");
	semiB.setBounds(635,505,50,51);
	tpFrame.getContentPane().add(semiB);
	
	
	final JButton apoB = new  JButton("'");
	apoB.setBounds(686,505,50,51);
	tpFrame.getContentPane().add(apoB);
	
	final JButton enterB = new  JButton("ENTER");
	enterB.setBounds(737,505,163,51);
	tpFrame.getContentPane().add(enterB);
	
	final JButton shiftB = new  JButton("SHIFT");
	shiftB.setBounds(32,558,175,51);
	tpFrame.getContentPane().add(shiftB);
	
	final JButton zB = new  JButton("Z");
	zB.setBounds(209,558,50,51);
	tpFrame.getContentPane().add(zB);
	
	final JButton xB = new  JButton("X");
	xB.setBounds(260,558,50,51);
	tpFrame.getContentPane().add(xB);
	
	final JButton cB = new  JButton("C");
	cB.setBounds(301,558,50,51);
	tpFrame.getContentPane().add(cB);
	
	final JButton vB = new  JButton("V");
	vB.setBounds(352,558,50,51);
	tpFrame.getContentPane().add(vB);
	
	
	final JButton bB = new  JButton("B");
	bB.setBounds(403,558,50,51);
	tpFrame.getContentPane().add(bB);
	
	final JButton spaceBarB = new  JButton("SPACEBAR");
	spaceBarB.setBounds(367,609,300,51);
	tpFrame.getContentPane().add(spaceBarB);
	
	
	
	final JButton nB = new  JButton("N");
	nB.setBounds(454,558,50,51);
	tpFrame.getContentPane().add(nB);
	
	final JButton mB = new  JButton("M");
	mB.setBounds(505,558,50,51);
	tpFrame.getContentPane().add(mB);
	
	final JButton commaB = new  JButton(",");
    commaB.setBounds(556,558,50,51);
	tpFrame.getContentPane().add(commaB);
	
	final JButton periodB = new  JButton(".");
    periodB.setBounds(607,558,50,51);
	tpFrame.getContentPane().add(periodB);
	
	
	final JButton fSlashB = new  JButton("/");
    fSlashB.setBounds(658,558,50,51);
	tpFrame.getContentPane().add(fSlashB);
	
	final JButton shiftB2 = new  JButton("SHIFT");
    shiftB2.setBounds(709,558,192,51);
	tpFrame.getContentPane().add(shiftB2);
	
	
	final JButton timerStart = new JButton("Start Timer");
	timerStart.setBounds(820,150, 130,30);
	tpFrame.getContentPane().add(timerStart);
	
	
	
	
	Color originalColor = oneB.getBackground();
	
	
	JTextArea textArea = new JTextArea(10,10);
	textArea.setWrapStyleWord(true);
	textArea.setLineWrap(true);
	textArea.setWrapStyleWord(true);
	textArea.setBounds(115,125,700,100);
	tpFrame.getContentPane().add(textArea);

	
	JTextArea textContent = new JTextArea(10,10);
	textContent.setEditable(false);
	textContent.setBounds(115, 270, 700,60);
	textContent.setText(pangramOne);
	tpFrame.getContentPane().add(textContent);
	
	
	textArea.addKeyListener(new KeyAdapter()
			{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			
			switch(keyCode)
			{
			case KeyEvent.VK_1:
				oneB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_2:
				twoB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_3:
				threeB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_4:
				fourB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_5:
				fiveB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_6:
				sixB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_7:
				sevenB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_8:
				eightB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_9:
				nineB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_0:
				zeroB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_BACK_QUOTE:
				specialB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_MINUS:
				dashB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_BACK_SPACE:
				backB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_EQUALS:
				plusB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_PLUS:
				plusB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_TAB:
				tabB.setBackground(Color.cyan);
			break;			
			
			case KeyEvent.VK_Q:
				qB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_W:
				wB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_E:
				eB.setBackground(Color.cyan);
			break;
			
			
			case KeyEvent.VK_R:
				rB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_T:
				tB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_Y:
				yB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_U:
				uB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_I:
				iB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_O:
				oB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_P:
				pB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_OPEN_BRACKET:
				leftCB_B.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_CLOSE_BRACKET:
				rightCB_B.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_BACK_SLASH:
				slashB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_CAPS_LOCK:
				capsB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_A:
				aB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_S:
				sB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_D:
				dB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_F:
				fB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_G:
				gB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_H:
				hB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_J:
				jB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_K:
				kB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_L:
				lB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_COLON:
				semiB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_QUOTE:
				apoB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_ENTER:
				enterB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_SHIFT:
				shiftB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_Z:
				zB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_X:
				xB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_C:
				cB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_V:
				vB.setBackground(Color.cyan);
			break;
			
			
			case KeyEvent.VK_B:
				bB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_N:
				nB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_M:
				mB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_COMMA:
				commaB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_PERIOD:
			periodB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_SLASH:
				fSlashB.setBackground(Color.cyan);
			break;
			
			case KeyEvent.VK_SPACE:
				spaceBarB.setBackground(Color.cyan);
			break;
			
			}
		}
		
		
		public void keyReleased(KeyEvent z)
		{
			int keyCode = z.getKeyCode();
			
			switch(keyCode)
			{
			case KeyEvent.VK_1:
				oneB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_2:
				twoB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_3:
				threeB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_4:
				fourB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_5:
				fiveB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_6:
				sixB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_7:
				sevenB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_8:
				eightB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_9:
				nineB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_0:
				zeroB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_MINUS:
				dashB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_BACK_SPACE:
				backB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_EQUALS:
				plusB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_PLUS:
				plusB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_BACK_QUOTE:
				specialB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_TAB:
				tabB.setBackground(originalColor);
			break;			
			
			case KeyEvent.VK_Q:
				qB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_W:
				wB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_E:
				eB.setBackground(originalColor);
			break;
			
			
			case KeyEvent.VK_R:
				rB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_T:
				tB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_Y:
				yB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_U:
				uB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_I:
				iB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_O:
				oB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_P:
				pB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_OPEN_BRACKET:
				leftCB_B.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_CLOSE_BRACKET:
				rightCB_B.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_BACK_SLASH:
				slashB.setBackground(originalColor);
			break;
			
			
			case KeyEvent.VK_CAPS_LOCK:
				capsB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_A:
				aB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_S:
				sB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_D:
				dB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_F:
				fB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_G:
				gB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_H:
				hB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_J:
				jB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_K:
				kB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_L:
				lB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_COLON:
				semiB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_QUOTE:
				apoB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_ENTER:
				enterB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_SHIFT:
				shiftB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_Z:
				zB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_X:
				xB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_C:
				cB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_V:
				vB.setBackground(originalColor);
			break;
			
			
			case KeyEvent.VK_B:
				bB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_N:
				nB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_M:
				mB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_COMMA:
				commaB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_PERIOD:
			periodB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_SLASH:
				fSlashB.setBackground(originalColor);
			break;
			
			case KeyEvent.VK_SPACE:
				spaceBarB.setBackground(originalColor);
			break;
			
			
			}
		}
			});
	

}
	
}


