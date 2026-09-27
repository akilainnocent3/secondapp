package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC4337j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface h extends q {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private final String f62572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        private final String f62573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f62574c;

        public a(@oy.m String str, @oy.m String str2, boolean z10) {
            this.f62572a = str;
            this.f62573b = str2;
            this.f62574c = z10;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        @oy.m
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @oy.m
        public String b() {
            return this.f62573b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.f62574c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @oy.m
        public String e() {
            return this.f62572a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        private final String f62575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.m
        private final Activity f62576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.m
        private final ISDemandOnlyBannerLayout f62577f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10, int i10, x xVar) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @oy.m
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.a(this.f62575d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @oy.m
        public final Activity f() {
            return this.f62576e;
        }

        @oy.m
        public final ISDemandOnlyBannerLayout g() {
            return this.f62577f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@oy.l String adFormat, @oy.m Activity activity, @oy.m String str, @oy.m ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @oy.m String str2, boolean z10) {
            super(str, str2, z10);
            m0.p(adFormat, "adFormat");
            this.f62575d = adFormat;
            this.f62576e = activity;
            this.f62577f = iSDemandOnlyBannerLayout;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nDemandOnlyLoadParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemandOnlyLoadParams.kt\ncom/ironsource/mediationsdk/demandOnly/DemandOnlyLoadParams$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private String f62578a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        private Activity f62579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        private String f62580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f62581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.m
        private String f62582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.m
        private ISDemandOnlyBannerLayout f62583f;

        @oy.l
        public final c a(@oy.l IronSource.a adFormat) {
            m0.p(adFormat, "adFormat");
            String string = adFormat.toString();
            m0.o(string, "adFormat.toString()");
            this.f62578a = string;
            return this;
        }

        @oy.l
        public final c b(@oy.m String str) {
            this.f62580c = str;
            return this;
        }

        @oy.l
        public final c a(@oy.m Activity activity) {
            this.f62579b = activity;
            return this;
        }

        @oy.l
        public final d b() {
            return new d(this.f62578a, this.f62579b, this.f62580c, this.f62582e, this.f62581d);
        }

        @oy.l
        public final c a(@oy.m Activity activity, @oy.m Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f62579b = activity;
            return this;
        }

        @oy.l
        public final c a(boolean z10) {
            this.f62581d = z10;
            return this;
        }

        @oy.l
        public final c a(@oy.m String str) {
            this.f62582e = str;
            return this;
        }

        @oy.l
        public final c a(@oy.m ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f62583f = iSDemandOnlyBannerLayout;
            return this;
        }

        @oy.l
        public final b a() {
            return new b(this.f62578a, this.f62579b, this.f62580c, this.f62583f, this.f62582e, this.f62581d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends a implements InterfaceC4337j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        private final String f62584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.m
        private final Activity f62585e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z10, int i10, x xVar) {
            this(str, activity, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @oy.m
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.b(this.f62584d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC4337j
        @oy.m
        public Activity d() {
            return this.f62585e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@oy.l String adFormat, @oy.m Activity activity, @oy.m String str, @oy.m String str2, boolean z10) {
            super(str, str2, z10);
            m0.p(adFormat, "adFormat");
            this.f62584d = adFormat;
            this.f62585e = activity;
        }
    }

    @oy.m
    String b();

    boolean c();

    @oy.m
    String e();
}
