package rinde.sim.util.cli;

import org.apache.commons.cli.Option;

public interface MenuOption<T> {

  String getShortName();

  String getLongName();

  Option createOption(T builder);

  boolean execute(T builder, Value value);
}