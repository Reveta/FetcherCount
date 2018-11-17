package com.reveta.epam.bigData.inputTablesStep;

import com.reveta.epam.bigData.Utils;
import com.reveta.epam.bigData.resourses.Table;

import java.util.ArrayList;
import java.util.List;

public class InputByConsole implements InputTables {

  private List<Table> tableList;

  public InputByConsole() {
    this.tableList = new ArrayList<Table>();

    startConsoleDataStream();
  }

  private void startConsoleDataStream() {
    System.out.println("Enter table name and number of lines");
    System.out.println("Like: \n tabel_name \n 131313");
    System.out.println("Enter next to end (it`s tree zero)\n 000 ");

    String name = Utils.scanString();
    String count = Utils.scanString();
    while (isNot000(name) && isNot000(count)) {
      tableList.add(new Table(name, Integer.valueOf(count)));
      System.out.println("+1 saved\n");

      //TODO correct exit
      name = Utils.scanString();
      count = Utils.scanString();
    }
    System.out.println("Data was saved");
  }

  private boolean isNot000(String input) {
    return !input.equals("000");
  }

  public List<Table> getTables() {
    return null;
  }
}
