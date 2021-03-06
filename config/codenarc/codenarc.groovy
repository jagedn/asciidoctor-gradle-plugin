/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

ruleset {
    ruleset('rulesets/basic.xml') {
        exclude 'EmptyCatchBlock'
        exclude 'EmptyMethod'
    }
    ruleset('rulesets/imports.xml') {
        exclude 'MisorderedStaticImports'
    }
    ruleset('rulesets/naming.xml') {
        exclude 'PropertyName'
        ClassName {
            regex = '^[A-Z][a-zA-Z0-9]*$'
        }
        FieldName {
            finalRegex = '^_?[a-z][a-zA-Z0-9]*$'
            staticFinalRegex = '^[A-Z][A-Z_0-9]*$'
        }
        MethodName {
            regex = '^[a-z][a-zA-Z0-9_]*$'
            doNotApplyToFileNames = '*/test/*/*Spec.groovy,*/*Test/*/*Spec.groovy,*/test/*/*Specification.groovy,*/*Test/*/*Specification.groovy'
        }
        VariableName {
            finalRegex = '^_?[a-z][a-zA-Z0-9]*$'
        }
    }
    ruleset('rulesets/unused.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/logging.xml')
    ruleset('rulesets/braces.xml') {
       exclude 'IfStatementBraces'
    }
    ruleset('rulesets/size.xml')  {
        exclude 'CrapMetric'
    }
    ruleset('rulesets/unnecessary.xml')
    ruleset('rulesets/dry.xml') {
        DuplicateListLiteral {
            doNotApplyToFileNames = '*/test/*/*Spec.groovy,*/*Test/*/*Spec.groovy,*/test/*/*Specification.groovy,*/*Test/*/*Specification.groovy'
        }
        DuplicateMapLiteral {
            doNotApplyToFileNames = '*/test/*/*Spec.groovy,*/*Test/*/*Spec.groovy,*/test/*/*Specification.groovy,*/*Test/*/*Specification.groovy'
        }
        DuplicateNumberLiteral {
            doNotApplyToFileNames = '*/test/*/*Spec.groovy,*/*Test/*/*Spec.groovy,*/test/*/*Specification.groovy,*/*Test/*/*Specification.groovy'
        }
        DuplicateStringLiteral {
            doNotApplyToFileNames = '*/test/*/*Spec.groovy,*/*Test/*/*Spec.groovy,*/test/*/*Specification.groovy,*/*Test/*/*Specification.groovy'
        }
    }
    ruleset('rulesets/design.xml') {
        exclude 'Instanceof'
    }
}
