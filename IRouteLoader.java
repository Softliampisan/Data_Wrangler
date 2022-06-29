// --== CS400 Project 3 File Header ==--
// Name: <Soft Liampisan>
// Email: <liampisan@wisc.edu>
// Team: <AK>
// TA: <name of your team's ta>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>

import java.util.List;

import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Instances of classes that implement this interface can be used to load a list of uber pick ups from a specified json source file
 * The following JSON names are used to load these route attributes:
 *   - NAME: The name of the passenger requesting to be picked up
 *   - TIME: The time that the passenger requested to be picked up
 *   - DLOCATION: The location of the driver
 *   - PLOCATION: The location of the passenger
 */
public interface IRouteLoader {
  /**
   * This method loads the list of uber pick ups described within a json file.
   * @param filepath is relative to executable's working directory
   * @return a list of route objects that were read from specified file
   * @throws FileNotFoundException
   * @throws IOException 
   */
  public List<IRoute> loadUberPickUp(String filepath) throws FileNotFoundException, IOException;
}


