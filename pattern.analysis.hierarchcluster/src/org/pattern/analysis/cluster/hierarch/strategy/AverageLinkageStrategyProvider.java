/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pattern.analysis.cluster.hierarch.strategy;

import org.openide.util.lookup.ServiceProvider;
import org.patern.clustering.hierarchical.strategy.AverageLinkageStrategy;
import org.patern.clustering.hierarchical.strategy.LinkageStrategy;

/**
 *
 * @author palas
 */
@ServiceProvider(service = LinkageStrategyProvider.class)
public class AverageLinkageStrategyProvider implements LinkageStrategyProvider{

    @Override
    public String getDisplayName() {
        return "Average";
    }

    @Override
    public LinkageStrategy getStrategy() {
        return new AverageLinkageStrategy();
    }
    
}
