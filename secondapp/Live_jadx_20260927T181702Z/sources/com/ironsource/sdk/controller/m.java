package com.ironsource.sdk.controller;

import com.ironsource.C4523t8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f63820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        private final String f63821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        private final String f63822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.m
        private final String f63823d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @cs.k
        public a(@oy.l String funToCall) {
            this(funToCall, null, null, null, 14, null);
            kotlin.jvm.internal.m0.p(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        @oy.l
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSA_CORE.SDKController.runFunction('" + this.f63820a);
            String str = this.f63821b;
            if (str != null && str.length() != 0) {
                sb2.append("?parameters=" + this.f63821b);
            }
            String str2 = this.f63822c;
            if (str2 != null && str2.length() != 0) {
                sb2.append("','" + this.f63822c);
            }
            String str3 = this.f63823d;
            if (str3 != null && str3.length() != 0) {
                sb2.append("','" + this.f63823d);
            }
            sb2.append("');");
            String string = sb2.toString();
            kotlin.jvm.internal.m0.o(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @cs.k
        public a(@oy.l String funToCall, @oy.m String str) {
            this(funToCall, str, null, null, 12, null);
            kotlin.jvm.internal.m0.p(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @cs.k
        public a(@oy.l String funToCall, @oy.m String str, @oy.m String str2) {
            this(funToCall, str, str2, null, 8, null);
            kotlin.jvm.internal.m0.p(funToCall, "funToCall");
        }

        @cs.k
        public a(@oy.l String funToCall, @oy.m String str, @oy.m String str2, @oy.m String str3) {
            kotlin.jvm.internal.m0.p(funToCall, "funToCall");
            this.f63820a = funToCall;
            this.f63821b = str;
            this.f63822c = str2;
            this.f63823d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.x xVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f63824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private String f63825b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@oy.l m jsMethod, int i10) {
            this(jsMethod.a(), i10);
            kotlin.jvm.internal.m0.p(jsMethod, "jsMethod");
        }

        @Override // com.ironsource.sdk.controller.m
        @oy.l
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f63824a != C4523t8.d.MODE_0.b() && (this.f63824a < C4523t8.d.MODE_1.b() || this.f63824a > C4523t8.d.MODE_3.b())) {
                str = "empty";
            }
            String str2 = "try{" + this.f63825b + "}catch(e){" + str + "}";
            kotlin.jvm.internal.m0.o(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }

        public b(@oy.l String script, int i10) {
            kotlin.jvm.internal.m0.p(script, "script");
            this.f63825b = script;
            this.f63824a = i10;
        }
    }

    @oy.l
    String a();
}
