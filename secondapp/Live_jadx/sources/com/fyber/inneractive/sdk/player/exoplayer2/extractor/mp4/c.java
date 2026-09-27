package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;
    public static final int H0;
    public static final int I0;
    public static final int J0;
    public static final int K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f46110l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f46112m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f46114n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f46116o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f46118p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f46120q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f46122r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f46124s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f46126t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f46128u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f46130v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f46132w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f46134x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f46136y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f46138z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f46089b = z.a("ftyp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46091c = z.a("avc1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46093d = z.a("avc3");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46095e = z.a("hvc1");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46097f = z.a("hev1");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46099g = z.a(x4.m.f144361i);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46101h = z.a("d263");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46103i = z.a("mdat");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f46105j = z.a("mp4a");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f46107k = z.a(".mp3");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f46109l = z.a("wave");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f46111m = z.a("lpcm");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f46113n = z.a("sowt");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f46115o = z.a("ac-3");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f46117p = z.a("dac3");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f46119q = z.a("ec-3");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f46121r = z.a("dec3");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f46123s = z.a("dtsc");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f46125t = z.a("dtsh");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46127u = z.a("dtsl");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f46129v = z.a("dtse");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f46131w = z.a("ddts");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f46133x = z.a("tfdt");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f46135y = z.a("tfhd");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f46137z = z.a("trex");
    public static final int A = z.a("trun");
    public static final int B = z.a("sidx");
    public static final int C = z.a("moov");
    public static final int D = z.a("mvhd");
    public static final int E = z.a("trak");
    public static final int F = z.a("mdia");
    public static final int G = z.a("minf");
    public static final int H = z.a("stbl");
    public static final int I = z.a("avcC");
    public static final int J = z.a("hvcC");
    public static final int K = z.a("esds");
    public static final int L = z.a("moof");
    public static final int M = z.a("traf");
    public static final int N = z.a("mvex");
    public static final int O = z.a("mehd");
    public static final int P = z.a("tkhd");
    public static final int Q = z.a("edts");
    public static final int R = z.a("elst");
    public static final int S = z.a("mdhd");
    public static final int T = z.a("hdlr");
    public static final int U = z.a("stsd");
    public static final int V = z.a("pssh");
    public static final int W = z.a("sinf");
    public static final int X = z.a("schm");
    public static final int Y = z.a("schi");
    public static final int Z = z.a("tenc");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f46088a0 = z.a("encv");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f46090b0 = z.a("enca");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f46092c0 = z.a("frma");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f46094d0 = z.a("saiz");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f46096e0 = z.a("saio");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f46098f0 = z.a("sbgp");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f46100g0 = z.a("sgpd");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f46102h0 = z.a(CommonUrlParts.UUID);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f46104i0 = z.a("senc");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f46106j0 = z.a("pasp");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f46108k0 = z.a("TTML");

    static {
        z.a("vmhd");
        f46110l0 = z.a("mp4v");
        f46112m0 = z.a("stts");
        f46114n0 = z.a("stss");
        f46116o0 = z.a("ctts");
        f46118p0 = z.a("stsc");
        f46120q0 = z.a("stsz");
        f46122r0 = z.a("stz2");
        f46124s0 = z.a("stco");
        f46126t0 = z.a("co64");
        f46128u0 = z.a("tx3g");
        f46130v0 = z.a("wvtt");
        f46132w0 = z.a("stpp");
        f46134x0 = z.a("c608");
        f46136y0 = z.a("samr");
        f46138z0 = z.a("sawb");
        A0 = z.a("udta");
        B0 = z.a("meta");
        C0 = z.a("ilst");
        D0 = z.a("mean");
        E0 = z.a("name");
        F0 = z.a("data");
        G0 = z.a("emsg");
        H0 = z.a("st3d");
        I0 = z.a("sv3d");
        J0 = z.a("proj");
        K0 = z.a("vp08");
        L0 = z.a("vp09");
        M0 = z.a("vpcC");
        N0 = z.a("camm");
        O0 = z.a("alac");
    }

    public c(int i10) {
        this.f46139a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f46139a);
    }
}
