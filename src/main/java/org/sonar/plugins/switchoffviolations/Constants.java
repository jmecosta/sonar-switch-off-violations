/*
 * Sonar Switch Off Violations Plugin
 * Copyright (C) 2011 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.switchoffviolations;

public interface Constants {
  // New Properties
  String PATTERNS_MULTICRITERIA_KEY = "sonar.switchoffviolations.multicriteria";
  String RESOURCE_KEY = "resourceKey";
  String RULE_KEY = "ruleKey";
  String LINE_RANGE_KEY = "lineRange";
  String PATTERNS_BLOCK_KEY = "sonar.switchoffviolations.block";
  String BEGIN_BLOCK_REGEXP = "beginBlockRegexp";
  String END_BLOCK_REGEXP = "endBlockRegexp";
  String PATTERNS_ALLFILE_KEY = "sonar.switchoffviolations.allfile";
  String FILE_REGEXP = "fileRegexp";

  // Deprecated Properties
  String LOCATION_PARAMETER_KEY = "sonar.switchoffviolations.configFile";
  String PATTERNS_PARAMETER_KEY = "sonar.switchoffviolations.patterns";
}
