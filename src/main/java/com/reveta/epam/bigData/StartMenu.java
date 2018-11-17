package com.reveta.epam.bigData;

import com.reveta.epam.bigData.countStep.CountEngine;
import com.reveta.epam.bigData.countStep.CountEngineImpl;
import com.reveta.epam.bigData.inputTablesStep.InputByConsole;
import com.reveta.epam.bigData.inputTablesStep.InputTables;
import com.reveta.epam.bigData.yamlGeneretStep.YamlGenerator;
import com.reveta.epam.bigData.yamlGeneretStep.YamlGeneratorImpl;

public class StartMenu {
  public static void start() {

    InputTables inputTables = new InputByConsole();
    CountEngine engine = new CountEngineImpl(inputTables.getTables());
    YamlGenerator generator = new YamlGeneratorImpl(engine.getResult());
    generator.createYaml();
  };
}
