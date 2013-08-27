package org.opencb.commons.bioformats.commons.core.vcfstats;

import org.opencb.commons.bioformats.commons.core.variant.vcf4.Genotype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaleman
 * Date: 8/26/13
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class VcfRecordStat {
    private String chromosome;
    private Long position;
    private String ref_allele;
    private String[] alt_alleles;
    private String maf_allele;
    private String mgf_allele;
    private Integer num_alleles;
    private Integer[] alleles_count;
    private Integer[] genotypes_count;
    private List<Genotype> genotypes;


    private Float[] alleles_freq;
    private Float[] genotypes_freq;
    private Float maf;
    private Float mgf;
    private Integer missing_alleles;
    private Integer missing_genotypes;
    private Integer mendelinan_errors;
    private Boolean is_indel;
    private Float cases_percent_dominant;
    private Float controls_percent_dominant;
    private Float cases_percent_recessive;
    private Float controls_percent_recessive;
    private Integer transitions_count;
    private Integer transversions_count;


    public VcfRecordStat() {
        this.chromosome                 = "";
        this.ref_allele                 = "";
        this.alt_alleles                = null;
        this.maf_allele                 = "";
        this.mgf_allele                 = "";
        this.position                   = new Long(0);
        this.num_alleles                = new Integer(0);
        this.alleles_count              = null;
        this.genotypes_count            = null;
        this.missing_alleles            = new Integer(0);
        this.missing_genotypes          = new Integer(0);
        this.mendelinan_errors          = new Integer(0);
        this.alleles_freq               = null;
        this.genotypes_freq             = null;
        this.maf                        = new Float(0.0);
        this.mgf                        = new Float(0.0);
        this.cases_percent_dominant     = new Float(0.0);
        this.controls_percent_dominant  = new Float(0.0);
        this.cases_percent_recessive    = new Float(0.0);
        this.controls_percent_recessive = new Float(0.0);
        this.is_indel                   = false;
        this.genotypes = new ArrayList<Genotype>((int) Math.pow(this.num_alleles, 2));
        this.transitions_count = 0;
        this.transversions_count = 0;
    }

    @Override
    public String toString() {
        return "VcfRecordStat{" +
                "chromosome='" + chromosome + '\'' +
                ", position=" + position +
                ", ref_allele='" + ref_allele + '\'' +
                ", alt_alleles='" + Arrays.toString(alt_alleles) + '\'' +
                ", maf_allele='" + maf_allele + '\'' +
                ", mgf_allele='" + mgf_allele + '\'' +
                ", num_alleles=" + num_alleles +
                ", alleles_count=" + Arrays.toString(alleles_count) +
                ", genotypes_count=" + Arrays.toString(genotypes_count) +
                ", alleles_freg=" + Arrays.toString(alleles_freq) +
                ", genotypes_freq=" + Arrays.toString(genotypes_freq) +
                ", maf=" + maf +
                ", mgf=" + mgf +
                ", missing_alleles=" + missing_alleles +
                ", missing_genotypes=" + missing_genotypes +
                ", mendelinan_errors=" + mendelinan_errors +
                ", is_indel=" + is_indel +
                ", cases_percent_dominant=" + cases_percent_dominant +
                ", controls_percent_dominant=" + controls_percent_dominant +
                ", cases_percent_recessive=" + cases_percent_recessive +
                ", controls_percent_recessive=" + controls_percent_recessive +
                '}';
    }

    public String getChromosome() {
        return chromosome;
    }

    public Long getPosition() {
        return position;
    }

    public String getRef_alleles() {
        return ref_allele;
    }

    public String[] getAlt_alleles() {
        return alt_alleles;
    }

    public String getMaf_allele() {
        return maf_allele;
    }

    public String getMgf_allele() {
        return mgf_allele;
    }

    public Integer getNum_alleles() {
        return num_alleles;
    }

    public Integer[] getAlleles_count() {
        return alleles_count;
    }

    public Integer[] getGenotypes_count() {
        return genotypes_count;
    }

    public Float[] getAlleles_freq() {
        return alleles_freq;
    }

    public Float[] getGenotypes_freq() {
        return genotypes_freq;
    }

    public Float getMaf() {
        return maf;
    }

    public Float getMgf() {
        return mgf;
    }

    public Integer getMissing_alleles() {
        return missing_alleles;
    }

    public Integer getMissing_genotypes() {
        return missing_genotypes;
    }

    public Integer getMendelinan_errors() {
        return mendelinan_errors;
    }

    public Boolean getIs_indel() {
        return is_indel;
    }

    public Float getCases_percent_dominant() {
        return cases_percent_dominant;
    }

    public Float getControls_percent_dominant() {
        return controls_percent_dominant;
    }

    public Float getCases_percent_recessive() {
        return cases_percent_recessive;
    }

    public Float getControls_percent_recessive() {
        return controls_percent_recessive;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public void setRef_allele(String ref_allele) {
        this.ref_allele = ref_allele;
    }

    public void setAlt_alleles(String[] alt_alleles) {
        this.alt_alleles = alt_alleles;
    }

    public void setMaf_allele(String maf_allele) {
        this.maf_allele = maf_allele;
    }

    public void setMgf_allele(String mgf_allele) {
        this.mgf_allele = mgf_allele;
    }

    public void setNum_alleles(Integer num_alleles) {
        this.num_alleles = num_alleles;
    }

    public void setAlleles_count(Integer[] alleles_count) {
        this.alleles_count = alleles_count;
    }

    public void setGenotypes_count(Integer[] genotypes_count) {
        this.genotypes_count = genotypes_count;
    }

    public void setAlleles_freg(Float[] alleles_freg) {
        this.alleles_freq = alleles_freg;
    }

    public void setGenotypes_freq(Float[] genotypes_freq) {
        this.genotypes_freq = genotypes_freq;
    }

    public void setMaf(Float maf) {
        this.maf = maf;
    }

    public void setMgf(Float mgf) {
        this.mgf = mgf;
    }

    public void setMissing_alleles(Integer missing_alleles) {
        this.missing_alleles = missing_alleles;
    }

    public void setMissing_genotypes(Integer missing_genotypes) {
        this.missing_genotypes = missing_genotypes;
    }

    public void setMendelinan_errors(Integer mendelinan_errors) {
        this.mendelinan_errors = mendelinan_errors;
    }

    public void setIs_indel(Boolean is_indel) {
        this.is_indel = is_indel;
    }

    public void setCases_percent_dominant(Float cases_percent_dominant) {
        this.cases_percent_dominant = cases_percent_dominant;
    }

    public void setControls_percent_dominant(Float controls_percent_dominant) {
        this.controls_percent_dominant = controls_percent_dominant;
    }

    public void setCases_percent_recessive(Float cases_percent_recessive) {
        this.cases_percent_recessive = cases_percent_recessive;
    }

    public void setControls_percent_recessive(Float controls_percent_recessive) {
        this.controls_percent_recessive = controls_percent_recessive;
    }


    public List<Genotype> getGenotypes() {
        return genotypes;
    }

    public void setGenotypes(List<Genotype> genotypes) {
        this.genotypes = genotypes;
    }

    public Integer getTransitions_count() {
        return transitions_count;
    }

    public void setTransitions_count(Integer transitions_count) {
        this.transitions_count = transitions_count;
    }

    public Integer getTransversions_count() {
        return transversions_count;
    }

    public void setTransversions_count(Integer transversions_count) {
        this.transversions_count = transversions_count;
    }
}
