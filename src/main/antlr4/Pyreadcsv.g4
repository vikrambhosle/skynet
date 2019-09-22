grammar Pyreadcsv;
import  PyCommonGrammar ;

read_file : 'pandas.read_table' filepath_or_buffer ',' skiprows ',' sep=',' ;

filepath_or_buffer : Identifier;
skiprows: 'skiprows' '=' Identifier ;
sep : 'sep' '=' Identifier;
