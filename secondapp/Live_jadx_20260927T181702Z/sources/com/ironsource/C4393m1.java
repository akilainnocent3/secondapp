package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4393m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final C4393m1 f62319a = new C4393m1();

    /* JADX INFO: renamed from: com.ironsource.m1$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final IronSource.a f62320a;

        public a(@oy.l IronSource.a value) {
            kotlin.jvm.internal.m0.p(value, "value");
            this.f62320a = value;
        }

        private final IronSource.a a() {
            return this.f62320a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f62320a == ((a) obj).f62320a;
        }

        public int hashCode() {
            return this.f62320a.hashCode();
        }

        @oy.l
        public String toString() {
            return "AdFormatEntity(value=" + this.f62320a + gi.j.f86771d;
        }

        @oy.l
        public final a a(@oy.l IronSource.a value) {
            kotlin.jvm.internal.m0.p(value, "value");
            return new a(value);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f62320a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(C4581wf.c(this.f62320a)));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62321a;

        public b(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            this.f62321a = value;
        }

        private final String a() {
            return this.f62321a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.m0.g(this.f62321a, ((b) obj).f62321a);
        }

        public int hashCode() {
            return this.f62321a.hashCode();
        }

        @oy.l
        public String toString() {
            return "AdIdentifier(value=" + this.f62321a + gi.j.f86771d;
        }

        @oy.l
        public final b a(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            return new b(value);
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f62321a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f62321a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final AdSize f62322a;

        public c(@oy.l AdSize size) {
            kotlin.jvm.internal.m0.p(size, "size");
            this.f62322a = size;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            int i10;
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            String sizeDescription = this.f62322a.getSizeDescription();
            int iHashCode = sizeDescription.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && sizeDescription.equals("BANNER")) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                    } else if (sizeDescription.equals(com.ironsource.mediationsdk.l.f62702d)) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                } else if (sizeDescription.equals(com.ironsource.mediationsdk.l.f62700b)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            } else if (sizeDescription.equals(com.ironsource.mediationsdk.l.f62705g)) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            bundle.put(com.ironsource.mediationsdk.l.f62706h, Integer.valueOf(i10));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62323a;

        public d(@oy.l String auctionId) {
            kotlin.jvm.internal.m0.p(auctionId, "auctionId");
            this.f62323a = auctionId;
        }

        private final String a() {
            return this.f62323a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.m0.g(this.f62323a, ((d) obj).f62323a);
        }

        public int hashCode() {
            return this.f62323a.hashCode();
        }

        @oy.l
        public String toString() {
            return "AuctionId(auctionId=" + this.f62323a + gi.j.f86771d;
        }

        @oy.l
        public final d a(@oy.l String auctionId) {
            kotlin.jvm.internal.m0.p(auctionId, "auctionId");
            return new d(auctionId);
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f62323a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("auctionId", this.f62323a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$e */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62324a;

        public e(int i10) {
            this.f62324a = i10;
        }

        private final int a() {
            return this.f62324a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f62324a == ((e) obj).f62324a;
        }

        public int hashCode() {
            return this.f62324a;
        }

        @oy.l
        public String toString() {
            return "DemandOnly(value=" + this.f62324a + gi.j.f86771d;
        }

        @oy.l
        public final e a(int i10) {
            return new e(i10);
        }

        public static /* synthetic */ e a(e eVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = eVar.f62324a;
            }
            return eVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f62324a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$f */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f62325a;

        public f(long j10) {
            this.f62325a = j10;
        }

        private final long a() {
            return this.f62325a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f62325a == ((f) obj).f62325a;
        }

        public int hashCode() {
            return f0.p.a(this.f62325a);
        }

        @oy.l
        public String toString() {
            return "Duration(duration=" + this.f62325a + gi.j.f86771d;
        }

        @oy.l
        public final f a(long j10) {
            return new f(j10);
        }

        public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f62325a;
            }
            return fVar.a(j10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("duration", Long.valueOf(this.f62325a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$g */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62326a;

        public g(@oy.l String dynamicSourceId) {
            kotlin.jvm.internal.m0.p(dynamicSourceId, "dynamicSourceId");
            this.f62326a = dynamicSourceId;
        }

        private final String a() {
            return this.f62326a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.m0.g(this.f62326a, ((g) obj).f62326a);
        }

        public int hashCode() {
            return this.f62326a.hashCode();
        }

        @oy.l
        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f62326a + gi.j.f86771d;
        }

        @oy.l
        public final g a(@oy.l String dynamicSourceId) {
            kotlin.jvm.internal.m0.p(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        public static /* synthetic */ g a(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f62326a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f62326a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$h */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62327a;

        public h(@oy.l String sourceId) {
            kotlin.jvm.internal.m0.p(sourceId, "sourceId");
            this.f62327a = sourceId;
        }

        private final String a() {
            return this.f62327a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.m0.g(this.f62327a, ((h) obj).f62327a);
        }

        public int hashCode() {
            return this.f62327a.hashCode();
        }

        @oy.l
        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f62327a + gi.j.f86771d;
        }

        @oy.l
        public final h a(@oy.l String sourceId) {
            kotlin.jvm.internal.m0.p(sourceId, "sourceId");
            return new h(sourceId);
        }

        public static /* synthetic */ h a(h hVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.f62327a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f62327a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$i */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final i f62328a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$j */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class j implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62329a;

        public j(int i10) {
            this.f62329a = i10;
        }

        private final int a() {
            return this.f62329a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f62329a == ((j) obj).f62329a;
        }

        public int hashCode() {
            return this.f62329a;
        }

        @oy.l
        public String toString() {
            return "ErrorCode(code=" + this.f62329a + gi.j.f86771d;
        }

        @oy.l
        public final j a(int i10) {
            return new j(i10);
        }

        public static /* synthetic */ j a(j jVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = jVar.f62329a;
            }
            return jVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("errorCode", Integer.valueOf(this.f62329a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$k */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class k implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private final String f62330a;

        public k(@oy.m String str) {
            this.f62330a = str;
        }

        private final String a() {
            return this.f62330a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && kotlin.jvm.internal.m0.g(this.f62330a, ((k) obj).f62330a);
        }

        public int hashCode() {
            String str = this.f62330a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @oy.l
        public String toString() {
            return "ErrorReason(reason=" + this.f62330a + gi.j.f86771d;
        }

        @oy.l
        public final k a(@oy.m String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kVar.f62330a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            String str = this.f62330a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f62330a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$l */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class l implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62331a;

        public l(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            this.f62331a = value;
        }

        private final String a() {
            return this.f62331a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && kotlin.jvm.internal.m0.g(this.f62331a, ((l) obj).f62331a);
        }

        public int hashCode() {
            return this.f62331a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Ext1(value=" + this.f62331a + gi.j.f86771d;
        }

        @oy.l
        public final l a(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            return new l(value);
        }

        public static /* synthetic */ l a(l lVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = lVar.f62331a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f62331a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$m */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private final JSONObject f62332a;

        public m(@oy.m JSONObject jSONObject) {
            this.f62332a = jSONObject;
        }

        private final JSONObject a() {
            return this.f62332a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && kotlin.jvm.internal.m0.g(this.f62332a, ((m) obj).f62332a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f62332a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        @oy.l
        public String toString() {
            return "GenericParams(genericParams=" + this.f62332a + gi.j.f86771d;
        }

        @oy.l
        public final m a(@oy.m JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = mVar.f62332a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            JSONObject jSONObject = this.f62332a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$n */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class n implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62333a;

        public n(int i10) {
            this.f62333a = i10;
        }

        private final int a() {
            return this.f62333a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f62333a == ((n) obj).f62333a;
        }

        public int hashCode() {
            return this.f62333a;
        }

        @oy.l
        public String toString() {
            return "InstanceType(instanceType=" + this.f62333a + gi.j.f86771d;
        }

        @oy.l
        public final n a(int i10) {
            return new n(i10);
        }

        public static /* synthetic */ n a(n nVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = nVar.f62333a;
            }
            return nVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f62333a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$o */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class o implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62334a;

        public o(int i10) {
            this.f62334a = i10;
        }

        private final int a() {
            return this.f62334a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f62334a == ((o) obj).f62334a;
        }

        public int hashCode() {
            return this.f62334a;
        }

        @oy.l
        public String toString() {
            return "MultipleAdObjects(value=" + this.f62334a + gi.j.f86771d;
        }

        @oy.l
        public final o a(int i10) {
            return new o(i10);
        }

        public static /* synthetic */ o a(o oVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oVar.f62334a;
            }
            return oVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f62334a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$p */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class p implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62335a;

        public p(int i10) {
            this.f62335a = i10;
        }

        private final int a() {
            return this.f62335a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f62335a == ((p) obj).f62335a;
        }

        public int hashCode() {
            return this.f62335a;
        }

        @oy.l
        public String toString() {
            return "OneFlow(value=" + this.f62335a + gi.j.f86771d;
        }

        @oy.l
        public final p a(int i10) {
            return new p(i10);
        }

        public static /* synthetic */ p a(p pVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pVar.f62335a;
            }
            return pVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f62335a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$q */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class q implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62336a;

        public q(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            this.f62336a = value;
        }

        private final String a() {
            return this.f62336a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.m0.g(this.f62336a, ((q) obj).f62336a);
        }

        public int hashCode() {
            return this.f62336a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Placement(value=" + this.f62336a + gi.j.f86771d;
        }

        @oy.l
        public final q a(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            return new q(value);
        }

        public static /* synthetic */ q a(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.f62336a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("placement", this.f62336a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$r */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class r implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62337a;

        public r(int i10) {
            this.f62337a = i10;
        }

        private final int a() {
            return this.f62337a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f62337a == ((r) obj).f62337a;
        }

        public int hashCode() {
            return this.f62337a;
        }

        @oy.l
        public String toString() {
            return "Programmatic(programmatic=" + this.f62337a + gi.j.f86771d;
        }

        @oy.l
        public final r a(int i10) {
            return new r(i10);
        }

        public static /* synthetic */ r a(r rVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = rVar.f62337a;
            }
            return rVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f62337a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$s */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class s implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62338a;

        public s(@oy.l String sourceName) {
            kotlin.jvm.internal.m0.p(sourceName, "sourceName");
            this.f62338a = sourceName;
        }

        private final String a() {
            return this.f62338a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.m0.g(this.f62338a, ((s) obj).f62338a);
        }

        public int hashCode() {
            return this.f62338a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Provider(sourceName=" + this.f62338a + gi.j.f86771d;
        }

        @oy.l
        public final s a(@oy.l String sourceName) {
            kotlin.jvm.internal.m0.p(sourceName, "sourceName");
            return new s(sourceName);
        }

        public static /* synthetic */ s a(s sVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sVar.f62338a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f62338a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$t */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class t implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62339a;

        public t(int i10) {
            this.f62339a = i10;
        }

        private final int a() {
            return this.f62339a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f62339a == ((t) obj).f62339a;
        }

        public int hashCode() {
            return this.f62339a;
        }

        @oy.l
        public String toString() {
            return "RewardAmount(value=" + this.f62339a + gi.j.f86771d;
        }

        @oy.l
        public final t a(int i10) {
            return new t(i10);
        }

        public static /* synthetic */ t a(t tVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tVar.f62339a;
            }
            return tVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f62339a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$u */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class u implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62340a;

        public u(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            this.f62340a = value;
        }

        private final String a() {
            return this.f62340a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && kotlin.jvm.internal.m0.g(this.f62340a, ((u) obj).f62340a);
        }

        public int hashCode() {
            return this.f62340a.hashCode();
        }

        @oy.l
        public String toString() {
            return "RewardName(value=" + this.f62340a + gi.j.f86771d;
        }

        @oy.l
        public final u a(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            return new u(value);
        }

        public static /* synthetic */ u a(u uVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uVar.f62340a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f62340a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$v */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class v implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62341a;

        public v(@oy.l String version) {
            kotlin.jvm.internal.m0.p(version, "version");
            this.f62341a = version;
        }

        private final String a() {
            return this.f62341a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && kotlin.jvm.internal.m0.g(this.f62341a, ((v) obj).f62341a);
        }

        public int hashCode() {
            return this.f62341a.hashCode();
        }

        @oy.l
        public String toString() {
            return "SdkVersion(version=" + this.f62341a + gi.j.f86771d;
        }

        @oy.l
        public final v a(@oy.l String version) {
            kotlin.jvm.internal.m0.p(version, "version");
            return new v(version);
        }

        public static /* synthetic */ v a(v vVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = vVar.f62341a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f62341a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$w */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class w implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62342a;

        public w(int i10) {
            this.f62342a = i10;
        }

        private final int a() {
            return this.f62342a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f62342a == ((w) obj).f62342a;
        }

        public int hashCode() {
            return this.f62342a;
        }

        @oy.l
        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f62342a + gi.j.f86771d;
        }

        @oy.l
        public final w a(int i10) {
            return new w(i10);
        }

        public static /* synthetic */ w a(w wVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = wVar.f62342a;
            }
            return wVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f62342a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$x */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class x implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62343a;

        public x(@oy.l String subProviderId) {
            kotlin.jvm.internal.m0.p(subProviderId, "subProviderId");
            this.f62343a = subProviderId;
        }

        private final String a() {
            return this.f62343a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && kotlin.jvm.internal.m0.g(this.f62343a, ((x) obj).f62343a);
        }

        public int hashCode() {
            return this.f62343a.hashCode();
        }

        @oy.l
        public String toString() {
            return "SubProviderId(subProviderId=" + this.f62343a + gi.j.f86771d;
        }

        @oy.l
        public final x a(@oy.l String subProviderId) {
            kotlin.jvm.internal.m0.p(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        public static /* synthetic */ x a(x xVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = xVar.f62343a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put("spId", this.f62343a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$y */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class y implements InterfaceC4413n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62344a;

        public y(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            this.f62344a = value;
        }

        private final String a() {
            return this.f62344a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && kotlin.jvm.internal.m0.g(this.f62344a, ((y) obj).f62344a);
        }

        public int hashCode() {
            return this.f62344a.hashCode();
        }

        @oy.l
        public String toString() {
            return "TransId(value=" + this.f62344a + gi.j.f86771d;
        }

        @oy.l
        public final y a(@oy.l String value) {
            kotlin.jvm.internal.m0.p(value, "value");
            return new y(value);
        }

        public static /* synthetic */ y a(y yVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = yVar.f62344a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4413n1
        public void a(@oy.l Map<String, Object> bundle) {
            kotlin.jvm.internal.m0.p(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f62344a);
        }
    }

    private C4393m1() {
    }
}
