package easynotepad;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import static java.lang.Math.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import say.swing.JFontChooser;

public class NotePad extends javax.swing.JFrame {

    Map<String, Boolean> mp;
    int prev = 0;
    int curr = 0;

    void setmap() {
        mp = new HashMap<String, Boolean>();
        Scanner sc;
        String add = "D://dict.txt";
        try {
            sc = new Scanner(new FileReader(add));
            while (sc.hasNext()) {
                mp.put(sc.next(), true);
            }
            System.out.println("Finish Reading");
        } catch (Exception x) {

        }
    }

    Font font;
    public static String editortxt;
    File selected;
    String cutedTxt;
    String copiedString;

    public void writeToFile(String str, String address) {
        if (address == null) {
            filechooser.showOpenDialog(openmenu);
            selected = filechooser.getSelectedFile();
            address = selected.getAbsolutePath();
        }
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(address);

            for (int i = 0; i < str.length(); i++) {
                out.write(str.charAt(i));
            }
        } catch (Exception e) {

        }
    }

    public static void readFromFile(String address) {
        editortxt = "";
        FileInputStream in = null;
        try {
            in = new FileInputStream(address);
            int c;
            while ((c = in.read()) != -1) {
                editortxt = editortxt + (char) c;
            }
        } catch (Exception ex) {

        }
    }

    public NotePad() {
        initComponents();
        font = new Font("Times new Roman", 0, 14);
        editor.setFont(font);
        setmap();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filechooser = new javax.swing.JFileChooser();
        jMenu2 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        editor = new javax.swing.JEditorPane();
        menu = new javax.swing.JMenuBar();
        filemenu = new javax.swing.JMenu();
        openmenu = new javax.swing.JMenuItem();
        savemenu = new javax.swing.JMenuItem();
        saveasmenu = new javax.swing.JMenuItem();
        exitmenu = new javax.swing.JMenuItem();
        editmenu = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        roman = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        verdana = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        helpmenu = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(540, 200, 1000, 1200));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 800));
        setName("mainFrame"); // NOI18N

        editor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editorKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(editor);

        filemenu.setText("File");

        openmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openmenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 15)); // NOI18N
        openmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/notepad.PNG"))); // NOI18N
        openmenu.setText("Open");
        openmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openmenuActionPerformed(evt);
            }
        });
        filemenu.add(openmenu);

        savemenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        savemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/file.PNG"))); // NOI18N
        savemenu.setText("Save");
        savemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savemenuActionPerformed(evt);
            }
        });
        filemenu.add(savemenu);

        saveasmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveasmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/file2.PNG"))); // NOI18N
        saveasmenu.setText("Save as");
        saveasmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasmenuActionPerformed(evt);
            }
        });
        filemenu.add(saveasmenu);

        exitmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/exit.PNG"))); // NOI18N
        exitmenu.setText("Exit");
        exitmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitmenuActionPerformed(evt);
            }
        });
        filemenu.add(exitmenu);

        menu.add(filemenu);

        editmenu.setText("Edit");

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/cut.PNG"))); // NOI18N
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        editmenu.add(cut);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/notts.PNG"))); // NOI18N
        jMenuItem2.setText("Copy");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editmenu.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/notts.PNG"))); // NOI18N
        jMenuItem3.setText("Paste");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        editmenu.add(jMenuItem3);

        menu.add(editmenu);

        jMenu1.setText("Font");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenu5.setText("Font Size");

        jMenuItem1.setText("12");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem4.setText("14");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem15.setText("16");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem12.setText("18");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem14.setText("20");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem16.setText("22");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("24");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("26");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("28");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setText("30");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenu1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/pen.PNG"))); // NOI18N
        jMenu3.setText("Font Color");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/green.PNG"))); // NOI18N
        jMenuItem7.setText("Green");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/red.PNG"))); // NOI18N
        jMenuItem5.setText("RED");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/blue.PNG"))); // NOI18N
        jMenuItem8.setText("Blue");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/yellow.PNG"))); // NOI18N
        jMenuItem6.setText("Yellow");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/orange.PNG"))); // NOI18N
        jMenuItem9.setText("Orange");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/magenta.PNG"))); // NOI18N
        jMenuItem10.setText("Magenta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenu1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenu4.setText("Font Name");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenuItem11.setText("Arial");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        roman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        roman.setText("Helvetica");
        roman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanActionPerformed(evt);
            }
        });
        jMenu4.add(roman);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenuItem13.setText("Times New  Roman");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        verdana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        verdana.setText("Verdana");
        verdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdanaActionPerformed(evt);
            }
        });
        jMenu4.add(verdana);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenuItem21.setText("Courier");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem21);

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenuItem22.setText("Georgia");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem22);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenuItem23.setText("Palatino");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem23);

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenuItem24.setText("Garamond");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem24);

        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easynotepad/font size.PNG"))); // NOI18N
        jMenuItem25.setText("Impact Header");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem25);

        jMenu1.add(jMenu4);

        menu.add(jMenu1);

        helpmenu.setText("Help");
        menu.add(helpmenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openmenuActionPerformed
        try {
            filechooser.showOpenDialog(openmenu);
            selected = filechooser.getSelectedFile();
            readFromFile(selected.getAbsolutePath());
            editor.setText(editortxt);
        } catch (Exception x) {

        }
    }//GEN-LAST:event_openmenuActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        try {
            cutedTxt = editor.getSelectedText();
            String str = editor.getText();
            StringBuilder sb = new StringBuilder(str);
            int i = sb.indexOf(cutedTxt);
            sb.replace(i, i + cutedTxt.length(), "");
            str = sb.toString();
            editor.setText(str);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cutActionPerformed

    private void savemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savemenuActionPerformed
        String str;
        str = editor.getText();
        String path;
        try {
            path = selected.getAbsolutePath();
        } catch (Exception e) {
            path = null;
        }
        writeToFile(str, path);
    }//GEN-LAST:event_savemenuActionPerformed

    private void saveasmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasmenuActionPerformed
        String str = editor.getText();
        writeToFile(str, null);
    }//GEN-LAST:event_saveasmenuActionPerformed

    private void exitmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitmenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitmenuActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        copiedString = editor.getSelectedText();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void editorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorKeyTyped
        char key = evt.getKeyChar();
        try {
            if (key == ' ' || key == '\n' || key == '\r' || key == '\t') {
                String lastToken = "";
                String txt = editor.getText();
                int i = txt.length();
                if (txt.charAt(i - 1) == '\n') {
                    i -= 2;
                }
                for (i = i - 1; i >= 0; i--) {
                    if (txt.charAt(i) == '\n' || txt.charAt(i) == ' ' || txt.charAt(i) == '\t') {
                        break;
                    }
                    lastToken += txt.charAt(i);
                }
                StringBuilder sb = new StringBuilder(lastToken);
                lastToken = sb.reverse().toString();

                if (lastToken.charAt(lastToken.length() - 1) == '.') {

                } else if (mp.get(lastToken) != null) {
                    System.out.println("Correct");
                } else {
                    System.out.println("InCorrect");
                }
            }
        } catch (Exception z) {

        }
    }//GEN-LAST:event_editorKeyTyped

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

        JFontChooser fc = new JFontChooser();
        fc.showDialog(editor);
        editor.setFont(fc.getSelectedFont());

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
//Color c=colorChooser.showDialog(null,"Color Dialog");
//editor.setForeGround(c);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
 
          Font curr = editor.getFont();
        int size = curr.getSize();
        String name=curr.getFontName();
        Font f = new Font(name, 0, size);
        editor.setFont(f);
       editor.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    
              Font curr = editor.getFont();
        int size = curr.getSize();
        String name=curr.getFontName();
        Font f = new Font(name, 0, size);
        editor.setFont(f);
      editor.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
          Font curr = editor.getFont();
        int size = curr.getSize();
        String name=curr.getFontName();
        Font f = new Font(name, 0, size);
        editor.setFont(f);
        editor.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
  Font curr = editor.getFont();
        int size = curr.getSize();
        String name=curr.getName();
        Font f = new Font(name, 0, size);
        editor.setFont(f);
 
        editor.setForeground(Color.BLUE);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    
          Font curr = editor.getFont();
          
        int size = curr.getSize();
        String name=curr.getName();
        Font f = new Font(name, 0, size);
        editor.setFont(f);
        
        editor.setForeground(Color.RED);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      
          Font curr = editor.getFont();
        int size = curr.getSize();
        String name=curr.getFontName();
        Font f = new Font(name, 0, size);
        editor.setFont(f);
        editor.setForeground(Color.GREEN);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       
          Font curr = editor.getFont();
        int size = curr.getSize();

        Font f = new Font("Arial", 0, size);
        editor.setFont(f);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void romanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanActionPerformed
     
         Font curr = editor.getFont();
        int size = curr.getSize();
  
        Font f = new Font("Helvetica", 0, size);
        editor.setFont(f);
      

    }//GEN-LAST:event_romanActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
  Font curr = editor.getFont();
        int size = curr.getSize();
     
        Font f = new Font("Times New Roman", 0, size);
        editor.setFont(f);
      
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void verdanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdanaActionPerformed
   
  Font curr = editor.getFont();
        int size = curr.getSize();
      
        Font f = new Font("Verdana", 0, size);
        editor.setFont(f);        

    }//GEN-LAST:event_verdanaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
          Font curr = editor.getFont();
        String name=curr.getFontName();
        Font f = new Font(name, 0, 12);
        editor.setFont(f);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Font curr = editor.getFont();
     
        String name=curr.getFontName();
        Font f = new Font(name, 0, 14);
        editor.setFont(f);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    
       Font curr = editor.getFont();
        String name=curr.getFontName();
        Font f = new Font(name, 0, 16);
        editor.setFont(f);
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
  Font curr = editor.getFont();
       
        String name=curr.getFontName();
        Font f = new Font(name, 0, 18);
        editor.setFont(f);    

    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
      
         Font curr = editor.getFont();
   
        String name=curr.getFontName();
        Font f = new Font(name, 0, 28);
        editor.setFont(f);   
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
 Font curr = editor.getFont();
     
        String name=curr.getFontName();
        Font f = new Font(name, 0, 30);
        editor.setFont(f);   
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
         Font curr = editor.getFont();
   
        String name=curr.getFontName();
        Font f = new Font(name, 0, 20);
        editor.setFont(f);   
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
 Font curr = editor.getFont();

        String name=curr.getFontName();
        Font f = new Font(name, 0, 22);
        editor.setFont(f);   
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
    
         Font curr = editor.getFont();
  
        String name=curr.getFontName();
        Font f = new Font(name, 0, 24);
        editor.setFont(f);   
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
         Font curr = editor.getFont();
     
        String name=curr.getFontName();
        Font f = new Font(name, 0, 26);
        editor.setFont(f);   
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
 Font curr = editor.getFont();
        int size = curr.getSize();

        Font f = new Font("Courier", 0, size);
        editor.setFont(f);        
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
         Font curr = editor.getFont();
        int size = curr.getSize();
  
        Font f = new Font("Georgia", 0, size);
        editor.setFont(f); 
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
 Font curr = editor.getFont();
        int size = curr.getSize();

        Font f = new Font("Palatino", 0, size);
        editor.setFont(f); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
         Font curr = editor.getFont();
        int size = curr.getSize();
  
        Font f = new Font("Garamond", 0, size);
        editor.setFont(f); 
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
 Font curr = editor.getFont();
        int size = curr.getSize();

        Font f = new Font("Impact Header", 0, size);
        editor.setFont(f); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu editmenu;
    private javax.swing.JEditorPane editor;
    private javax.swing.JMenuItem exitmenu;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JMenu filemenu;
    private javax.swing.JMenu helpmenu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem openmenu;
    private javax.swing.JMenuItem roman;
    private javax.swing.JMenuItem saveasmenu;
    private javax.swing.JMenuItem savemenu;
    private javax.swing.JMenuItem verdana;
    // End of variables declaration//GEN-END:variables
}
