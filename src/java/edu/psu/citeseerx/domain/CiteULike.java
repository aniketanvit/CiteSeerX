/*
 * Copyright 2007 Penn State University
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.psu.citeseerx.domain;

import java.io.Serializable;

/**
 * CiteULike data carrier.
 *
 * @author Juan Pablo Fernandez Ramirez
 * @version $Rev: 191 $ $Date: 2012-02-08 14:32:39 -0500 (Wed, 08 Feb 2012) $
 */
public class CiteULike implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -1229275765441415659L;
    
    private String citeulikeID;

    public String getCiteulikeID() {
        return citeulikeID;
    } //- getCiteulikeID

    public void setCiteulikeID(String citeulikeID) {
        this.citeulikeID = citeulikeID;
    } //- setCiteulikeID
    
    private String citeSeerXID;

    public String getCiteSeerXID() {
        return citeSeerXID;
    } //- getCiteSeerXID

    public void setCiteSeerXID(String citeSeerXID) {
        this.citeSeerXID = citeSeerXID;
    } //- setCiteSeerXID

} //- class CiteULike
