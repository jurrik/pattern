/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pattern.analysis.cluster.hierarch;

import java.awt.Image;
import org.netbeans.core.spi.multiview.MultiViewDescription;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.openide.util.HelpCtx;
import org.openide.util.lookup.Lookups;
import org.openide.windows.TopComponent;

/**
 *
 * @author palas
 */
public class ParticleImageClusterViewDescription implements MultiViewDescription{
    
    private DistanceAnalysis analysis;

    public ParticleImageClusterViewDescription(DistanceAnalysis analysis) {
        this.analysis = analysis;
    }
    
    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_NEVER;
    }

    @Override
    public String getDisplayName() {
        return "Clustering";
    }

    @Override
    public Image getIcon() {
        return null;
    }

    @Override
    public HelpCtx getHelpCtx() {
        return null;
    }

    @Override
    public String preferredID() {
        return "AnalysisTC";
    }

    @Override
    public MultiViewElement createElement() {
        return new ParticleImageClusterTC(Lookups.singleton(analysis));
    }
    
}
