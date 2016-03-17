/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.parser;

import compilador.lexer.*;
import compilador.node.*;
import compilador.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    protected void filter() throws ParserException, LexerException, IOException
    {
        // Empty body
    }

    private void push(int numstate, ArrayList<Object> listNode, boolean hidden) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!hidden)
        {
            filter();
        }

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null, true);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list, false);
                    }
		    break;
                case REDUCE:
                    {
                        int reduction = this.action[1];
                        if(reduction < 500) reduce_0(reduction);
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PProgram node1 = (PProgram) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }

    private void reduce_0(int reduction) throws IOException, LexerException, ParserException
    {
        switch(reduction)
        {
            case 0: /* reduce ADeclListProgram */
            {
                ArrayList<Object> list = new0();
                push(goTo(0), list, false);
            }
            break;
            case 1: /* reduce ADeclList */
            {
                ArrayList<Object> list = new1();
                push(goTo(1), list, false);
            }
            break;
            case 2: /* reduce ADeclDeclList */
            {
                ArrayList<Object> list = new2();
                push(goTo(1), list, false);
            }
            break;
            case 3: /* reduce AVarDeclDecl */
            {
                ArrayList<Object> list = new3();
                push(goTo(2), list, false);
            }
            break;
            case 4: /* reduce AVarDecl */
            {
                ArrayList<Object> list = new4();
                push(goTo(3), list, false);
            }
            break;
            case 5: /* reduce AIntTypeDecl */
            {
                ArrayList<Object> list = new5();
                push(goTo(4), list, false);
            }
            break;
            case 6: /* reduce AVoidTypeDecl */
            {
                ArrayList<Object> list = new6();
                push(goTo(4), list, false);
            }
            break;
            case 7: /* reduce AVarDeclId */
            {
                ArrayList<Object> list = new7();
                push(goTo(5), list, false);
            }
            break;
            case 8: /* reduce APlusAddOp */
            {
                ArrayList<Object> list = new8();
                push(goTo(6), list, false);
            }
            break;
            case 9: /* reduce AMinusAddOp */
            {
                ArrayList<Object> list = new9();
                push(goTo(6), list, false);
            }
            break;
            case 10: /* reduce ATimesMultOp */
            {
                ArrayList<Object> list = new10();
                push(goTo(7), list, false);
            }
            break;
            case 11: /* reduce ADivMultOp */
            {
                ArrayList<Object> list = new11();
                push(goTo(7), list, false);
            }
            break;
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce ADeclListProgram */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PProgram pprogramNode1;
        {
            // Block
        PDeclList pdecllistNode2;
        pdecllistNode2 = (PDeclList)nodeArrayList1.get(0);

        pprogramNode1 = new ADeclListProgram(pdecllistNode2);
        }
	nodeList.add(pprogramNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce ADeclList */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PDeclList pdecllistNode1;
        {
            // Block
        PDeclList pdecllistNode2;
        PDecl pdeclNode3;
        pdecllistNode2 = (PDeclList)nodeArrayList1.get(0);
        pdeclNode3 = (PDecl)nodeArrayList2.get(0);

        pdecllistNode1 = new ADeclList(pdecllistNode2, pdeclNode3);
        }
	nodeList.add(pdecllistNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce ADeclDeclList */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PDeclList pdecllistNode1;
        {
            // Block
        PDecl pdeclNode2;
        pdeclNode2 = (PDecl)nodeArrayList1.get(0);

        pdecllistNode1 = new ADeclDeclList(pdeclNode2);
        }
	nodeList.add(pdecllistNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce AVarDeclDecl */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PDecl pdeclNode1;
        {
            // Block
        PVarDecl pvardeclNode2;
        pvardeclNode2 = (PVarDecl)nodeArrayList1.get(0);

        pdeclNode1 = new AVarDeclDecl(pvardeclNode2);
        }
	nodeList.add(pdeclNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce AVarDecl */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PVarDecl pvardeclNode1;
        {
            // Block
        PTypeDecl ptypedeclNode2;
        TTId ttidNode3;
        ptypedeclNode2 = (PTypeDecl)nodeArrayList1.get(0);
        ttidNode3 = (TTId)nodeArrayList2.get(0);

        pvardeclNode1 = new AVarDecl(ptypedeclNode2, ttidNode3);
        }
	nodeList.add(pvardeclNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new5() /* reduce AIntTypeDecl */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTypeDecl ptypedeclNode1;
        {
            // Block
        TIntegerNumber tintegernumberNode2;
        tintegernumberNode2 = (TIntegerNumber)nodeArrayList1.get(0);

        ptypedeclNode1 = new AIntTypeDecl(tintegernumberNode2);
        }
	nodeList.add(ptypedeclNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new6() /* reduce AVoidTypeDecl */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PTypeDecl ptypedeclNode1;
        {
            // Block
        TVoid tvoidNode2;
        tvoidNode2 = (TVoid)nodeArrayList1.get(0);

        ptypedeclNode1 = new AVoidTypeDecl(tvoidNode2);
        }
	nodeList.add(ptypedeclNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new7() /* reduce AVarDeclId */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PVarDeclId pvardeclidNode1;
        {
            // Block
        TTId ttidNode2;
        ttidNode2 = (TTId)nodeArrayList1.get(0);

        pvardeclidNode1 = new AVarDeclId(ttidNode2);
        }
	nodeList.add(pvardeclidNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new8() /* reduce APlusAddOp */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAddOp paddopNode1;
        {
            // Block
        TPlus tplusNode2;
        tplusNode2 = (TPlus)nodeArrayList1.get(0);

        paddopNode1 = new APlusAddOp(tplusNode2);
        }
	nodeList.add(paddopNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new9() /* reduce AMinusAddOp */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAddOp paddopNode1;
        {
            // Block
        TMinus tminusNode2;
        tminusNode2 = (TMinus)nodeArrayList1.get(0);

        paddopNode1 = new AMinusAddOp(tminusNode2);
        }
	nodeList.add(paddopNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new10() /* reduce ATimesMultOp */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PMultOp pmultopNode1;
        {
            // Block
        TTimes ttimesNode2;
        ttimesNode2 = (TTimes)nodeArrayList1.get(0);

        pmultopNode1 = new ATimesMultOp(ttimesNode2);
        }
	nodeList.add(pmultopNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new11() /* reduce ADivMultOp */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PMultOp pmultopNode1;
        {
            // Block
        TDiv tdivNode2;
        tdivNode2 = (TDiv)nodeArrayList1.get(0);

        pmultopNode1 = new ADivMultOp(tdivNode2);
        }
	nodeList.add(pmultopNode1);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {2, SHIFT, 1}, {8, SHIFT, 2}, },
			{{-1, REDUCE, 5}, },
			{{-1, REDUCE, 6}, },
			{{-1, ERROR, 3}, {36, ACCEPT, -1}, },
			{{-1, REDUCE, 0}, {2, SHIFT, 1}, {8, SHIFT, 2}, },
			{{-1, REDUCE, 2}, },
			{{-1, REDUCE, 3}, },
			{{-1, ERROR, 7}, {3, SHIFT, 9}, },
			{{-1, REDUCE, 1}, },
			{{-1, REDUCE, 4}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 3}, },
			{{-1, 4}, },
			{{-1, 5}, {4, 8}, },
			{{-1, 6}, },
			{{-1, 7}, },
			{{-1, -1}, },
			{{-1, -1}, },
			{{-1, -1}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: integer number, 'void'",
			"expecting: t id",
			"expecting: EOF",
			"expecting: integer number, 'void', EOF",
        };*/
    private static int[] errors;
/*      {
			0, 1, 1, 2, 3, 3, 3, 1, 3, 3, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}