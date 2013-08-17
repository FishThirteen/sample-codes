cmake_minimum_required (VERSION 2.6)
project (Tutorial)

#The version number
set (Tutorial_VERSION_MAJOR 1)
set (Tutorial_VERSION_MINOR 0)

#Configure a header file to pass some of the cmake settings to the source code
configure_file (
    "${PROJECT_SOURCE_DIR}/TutorialConfig.h.in" 
    "${PROJECT_BINARY_DIR}/TutorialConfig.h"
    )

#Add the binary tree to the search path for the include files
#so that we will find the TutorialConfig.h
include_directories ("${PROJECT_BINARY_DIR}")



#should we use our own math functions?
option (USE_MYMATH, "Use tuorial provided math implements", ON)

#add the MathFuncitons library?
if (USE_MYMATH)
    include_directories ("${PROJECT_SOURCE_DIR}/MathFunctions")
    add_subdirectory (MathFunctions)
    set (EXTRA_LIBS ${EXTRA_LIBS} MathFunctions)
endif (USE_MYMATH)

#Add the executable
add_executable (tutorial tutorial.cxx)
target_link_libraries (Tutorial ${EXTRA_LIBS})

