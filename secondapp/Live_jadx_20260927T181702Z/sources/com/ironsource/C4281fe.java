package com.ironsource;

import com.google.android.gms.cast.CastStatusCodes;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.fe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4281fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f61791a = new a(2001, a("initsdk"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f61792b = new a(2026, a("sdkrecoverstart"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f61793c = new a(2002, a("createcontrollerweb"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f61794d = new a(2003, a("createcontrollernative"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f61795e = new a(2004, a("controllerstageready"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f61796f = new a(2005, a("loadad"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f61797g = new a(2006, a("loadadfailed"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f61798h = new a(2007, a("initproduct"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static a f61799i = new a(2008, a("initproductfailed"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static a f61800j = new a(2009, a("loadproduct"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a f61801k = new a(2010, a("parseadmfailed"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static a f61802l = new a(2011, a("loadadsuccess"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static a f61803m = new a(2027, a("destroyproduct"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static a f61804n = new a(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, a("registerad"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static a f61805o = new a(2013, a("controllerfailed"));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static a f61806p = new a(2015, a("appendnativefeaturesdatafailed"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static a f61807q = new a(CastStatusCodes.DEVICE_CONNECTION_SUSPENDED, a("adunitcouldnotloadtowebview"));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static a f61808r = new a(2017, a("webviewcleanupfailed"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static a f61809s = new a(2018, a("removewebviewfailed"));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static a f61810t = new a(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, a("banneralreadydestroyed"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static a f61811u = new a(2021, a("fialedregactlifecycle"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static a f61812v = new a(2022, a("loadcontrollerhtml"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static a f61813w = new a(2023, a("controllerhtmlsuccess"));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static a f61814x = new a(2024, a("controllerhtmlfailed"));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static a f61815y = new a(2025, a("webviewcrashrpg"));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static a f61816z = new a(2031, a("getorientationcalled"));
    public static a A = new a(2032, a("webviewunavailable"));
    public static final a B = new a(2033, a("controller_init_delayed"));
    public static a C = new a(2034, a("loadControllerHtmlFromBundle"));

    /* JADX INFO: renamed from: com.ironsource.fe$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f61818b;

        public a(int i10, String str) {
            this.f61818b = i10;
            this.f61817a = str;
        }
    }

    public static String a(String str) {
        return G5.f59031c + str;
    }
}
