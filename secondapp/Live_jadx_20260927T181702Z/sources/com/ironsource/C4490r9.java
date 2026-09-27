package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;

/* JADX INFO: renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class C4490r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63467a = "IntegrationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63468b = "getNetworkSDKVersion";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63469c = "getAdapterSDKVersion";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f63470d = "getAdapterVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63471e = "getVersion";

    /* JADX INFO: renamed from: com.ironsource.r9$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f63472a;

        public a(Context context) {
            this.f63472a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C4490r9.f63467a, "--------------- Google Play Services --------------");
                if (!this.f63472a.getPackageManager().getApplicationInfo(this.f63472a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(C4490r9.f63467a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(C4490r9.f63467a, "Google Play Services - VERIFIED");
                String strB = com.ironsource.mediationsdk.r.m().b(this.f63472a);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                Log.i(C4490r9.f63467a, "GAID is: " + strB + " (use this for test devices)");
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                Log.e(C4490r9.f63467a, "Google Play Services - MISSING");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    private static boolean a(Context context, String str) {
        byte b10;
        Object objNewInstance;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals(to.c.facebook)) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (lowerCase.equals("admob")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (lowerCase.equals("vungle")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                Log.i(f63467a, "--------------- Meta --------------");
            } else if (b10 == 1) {
                Log.i(f63467a, "--------------- Google (AdMob and Ad Manager) --------------");
            } else if (b10 != 2) {
                Log.i(f63467a, "--------------- " + str + " --------------");
            } else {
                Log.i(f63467a, "--------------- Liftoff Monetization --------------");
            }
            try {
                Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + androidx.media3.session.fe.F + str + "Adapter");
                try {
                    objNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                } catch (NoSuchMethodException unused) {
                    objNewInstance = cls.getConstructor(null).newInstance(null);
                }
                b(objNewInstance);
                a(objNewInstance);
                return true;
            } catch (ClassNotFoundException e10) {
                C4485r4.d().a(e10);
                Log.e(f63467a, "Adapter - MISSING");
                return false;
            } catch (Exception e11) {
                C4485r4.d().a(e11);
                Log.e(f63467a, "Failed to instantiate adapter");
                return false;
            }
        } catch (Exception e12) {
            C4485r4.d().a(e12);
            Log.e(f63467a, "isAdapterValid " + str, e12);
            return false;
        }
    }

    public static void b(Context context) {
        Log.i(f63467a, "Verifying Integration:");
        c(context);
        String[] strArr = {wc.d.f142721f, "APS", "BidMachine", wc.d.f142732q, wc.d.f142730o, "Fyber", wc.d.f142717b, wc.d.f142734s, wc.d.f142723h, "IronSource", "Vungle", "Line", wc.d.f142722g, wc.d.f142727l, "MobileFuse", "Moloco", "MyTarget", wc.d.f142740y, wc.d.f142728m, "PubMatic", wc.d.f142735t, wc.d.C, Q6.H1, wc.d.f142741z, wc.d.f142726k, "YSO"};
        for (int i10 = 0; i10 < 26; i10++) {
            String str = strArr[i10];
            if (!a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.getClass();
                switch (lowerCase) {
                    case "vungle":
                        Log.i(f63467a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case "admob":
                        Log.i(f63467a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case "facebook":
                        Log.i(f63467a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(f63467a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.getClass();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase2.equals("admob")) {
                        }
                        break;
                    case 497130182:
                        if (!lowerCase2.equals(to.c.facebook)) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4490r9.b(android.content.Context):void");
            }

            private static void c(Context context) {
                Log.i(f63467a, "*** Permissions ***");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
                    Log.i(f63467a, "android.permission.INTERNET - VERIFIED");
                } else {
                    Log.e(f63467a, "android.permission.INTERNET - MISSING");
                }
                if (packageManager.checkPermission(com.bumptech.glide.manager.e.f31484b, context.getPackageName()) == 0) {
                    Log.i(f63467a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
                } else {
                    Log.e(f63467a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
                }
            }

            private static void b(Object obj) {
                String str;
                try {
                    Class<?> cls = obj.getClass();
                    if (obj instanceof LevelPlayBaseAdapter) {
                        str = f63468b;
                    } else {
                        str = f63469c;
                    }
                    Log.i(f63467a, "SDK Version - " + ((String) cls.getMethod(str, null).invoke(obj, null)));
                } catch (Exception e10) {
                    C4485r4.d().a(e10);
                    Log.w(f63467a, "Unable to get SDK version");
                }
            }

            private static void a(Context context) {
                new a(context).start();
            }

            private static void a(Object obj) {
                try {
                    Log.i(f63467a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f63470d : "getVersion", null).invoke(obj, null)));
                } catch (Exception e10) {
                    C4485r4.d().a(e10);
                    Log.w(f63467a, "Unable to get adapter version");
                }
            }
        }
