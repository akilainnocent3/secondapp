package ut;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yt.g;
import yt.i;
import yt.j;
import yt.k;
import yt.s;
import yt.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.g<rt.a.d, c> f139681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.g<rt.a.i, c> f139682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i.g<rt.a.i, Integer> f139683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i.g<rt.a.n, d> f139684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i.g<rt.a.n, Integer> f139685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.g<rt.a.q, List<rt.a.b>> f139686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.g<rt.a.q, Boolean> f139687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.g<rt.a.s, List<rt.a.b>> f139688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i.g<rt.a.c, Integer> f139689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i.g<rt.a.c, List<rt.a.n>> f139690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i.g<rt.a.c, Integer> f139691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i.g<rt.a.c, Integer> f139692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.g<rt.a.l, Integer> f139693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i.g<rt.a.l, List<rt.a.n>> f139694n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends i implements f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final e f139734i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static s<e> f139735j = new C1453a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yt.d f139736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<c> f139737d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<Integer> f139738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f139739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f139740g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f139741h;

        /* JADX INFO: renamed from: ut.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1453a extends yt.b<e> {
            @Override // yt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public e c(yt.e eVar, g gVar) throws k {
                return new e(eVar, gVar);
            }
        }

        static {
            e eVar = new e(true);
            f139734i = eVar;
            eVar.w();
        }

        public static e A(InputStream inputStream, g gVar) throws IOException {
            return f139735j.d(inputStream, gVar);
        }

        public static e s() {
            return f139734i;
        }

        private void w() {
            List list = Collections.EMPTY_LIST;
            this.f139737d = list;
            this.f139738e = list;
        }

        public static b x() {
            return b.o();
        }

        public static b y(e eVar) {
            return x().i(eVar);
        }

        @Override // yt.q
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return y(this);
        }

        @Override // yt.q
        public void a(yt.f fVar) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f139737d.size(); i10++) {
                fVar.d0(1, this.f139737d.get(i10));
            }
            if (u().size() > 0) {
                fVar.o0(42);
                fVar.o0(this.f139739f);
            }
            for (int i11 = 0; i11 < this.f139738e.size(); i11++) {
                fVar.b0(this.f139738e.get(i11).intValue());
            }
            fVar.i0(this.f139736c);
        }

        @Override // yt.i, yt.q
        public s<e> getParserForType() {
            return f139735j;
        }

        @Override // yt.q
        public int getSerializedSize() {
            int i10 = this.f139741h;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f139737d.size(); i11++) {
                iS += yt.f.s(1, this.f139737d.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f139738e.size(); i12++) {
                iP += yt.f.p(this.f139738e.get(i12).intValue());
            }
            int iP2 = iS + iP;
            if (!u().isEmpty()) {
                iP2 = iP2 + 1 + yt.f.p(iP);
            }
            this.f139739f = iP;
            int size = iP2 + this.f139736c.size();
            this.f139741h = size;
            return size;
        }

        @Override // yt.r
        public final boolean isInitialized() {
            byte b10 = this.f139740g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f139740g = (byte) 1;
            return true;
        }

        @Override // yt.r
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public e getDefaultInstanceForType() {
            return f139734i;
        }

        public List<Integer> u() {
            return this.f139738e;
        }

        public List<c> v() {
            return this.f139737d;
        }

        @Override // yt.q
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return x();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c extends i implements ut.e {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final c f139745o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static s<c> f139746p = new C1454a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final yt.d f139747c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f139748d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f139749e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f139750f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Object f139751g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public EnumC1455c f139752h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public List<Integer> f139753i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f139754j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public List<Integer> f139755k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f139756l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public byte f139757m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f139758n;

            /* JADX INFO: renamed from: ut.a$e$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static class C1454a extends yt.b<c> {
                @Override // yt.s
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public c c(yt.e eVar, g gVar) throws k {
                    return new c(eVar, gVar);
                }
            }

            /* JADX INFO: renamed from: ut.a$e$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public enum EnumC1455c implements j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static j.b<EnumC1455c> f139769f = new C1456a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f139771b;

                /* JADX INFO: renamed from: ut.a$e$c$c$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static class C1456a implements j.b<EnumC1455c> {
                    @Override // yt.j.b
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public EnumC1455c findValueByNumber(int i10) {
                        return EnumC1455c.a(i10);
                    }
                }

                EnumC1455c(int i10, int i11) {
                    this.f139771b = i11;
                }

                public static EnumC1455c a(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // yt.j.a
                public final int getNumber() {
                    return this.f139771b;
                }
            }

            static {
                c cVar = new c(true);
                f139745o = cVar;
                cVar.O();
            }

            private void O() {
                this.f139749e = 1;
                this.f139750f = 0;
                this.f139751g = "";
                this.f139752h = EnumC1455c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.f139753i = list;
                this.f139755k = list;
            }

            public static b P() {
                return b.o();
            }

            public static b Q(c cVar) {
                return P().i(cVar);
            }

            public static c y() {
                return f139745o;
            }

            public EnumC1455c A() {
                return this.f139752h;
            }

            public int B() {
                return this.f139750f;
            }

            public int C() {
                return this.f139749e;
            }

            public int D() {
                return this.f139755k.size();
            }

            public List<Integer> E() {
                return this.f139755k;
            }

            public String G() {
                Object obj = this.f139751g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                yt.d dVar = (yt.d) obj;
                String strV = dVar.v();
                if (dVar.m()) {
                    this.f139751g = strV;
                }
                return strV;
            }

            public yt.d H() {
                Object obj = this.f139751g;
                if (!(obj instanceof String)) {
                    return (yt.d) obj;
                }
                yt.d dVarG = yt.d.g((String) obj);
                this.f139751g = dVarG;
                return dVarG;
            }

            public int I() {
                return this.f139753i.size();
            }

            public List<Integer> J() {
                return this.f139753i;
            }

            public boolean K() {
                return (this.f139748d & 8) == 8;
            }

            public boolean L() {
                return (this.f139748d & 2) == 2;
            }

            public boolean M() {
                return (this.f139748d & 1) == 1;
            }

            public boolean N() {
                return (this.f139748d & 4) == 4;
            }

            @Override // yt.q
            /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return P();
            }

            @Override // yt.q
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return Q(this);
            }

            @Override // yt.q
            public void a(yt.f fVar) throws IOException {
                getSerializedSize();
                if ((this.f139748d & 1) == 1) {
                    fVar.a0(1, this.f139749e);
                }
                if ((this.f139748d & 2) == 2) {
                    fVar.a0(2, this.f139750f);
                }
                if ((this.f139748d & 8) == 8) {
                    fVar.S(3, this.f139752h.getNumber());
                }
                if (J().size() > 0) {
                    fVar.o0(34);
                    fVar.o0(this.f139754j);
                }
                for (int i10 = 0; i10 < this.f139753i.size(); i10++) {
                    fVar.b0(this.f139753i.get(i10).intValue());
                }
                if (E().size() > 0) {
                    fVar.o0(42);
                    fVar.o0(this.f139756l);
                }
                for (int i11 = 0; i11 < this.f139755k.size(); i11++) {
                    fVar.b0(this.f139755k.get(i11).intValue());
                }
                if ((this.f139748d & 4) == 4) {
                    fVar.O(6, H());
                }
                fVar.i0(this.f139747c);
            }

            @Override // yt.i, yt.q
            public s<c> getParserForType() {
                return f139746p;
            }

            @Override // yt.q
            public int getSerializedSize() {
                int i10 = this.f139758n;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f139748d & 1) == 1 ? yt.f.o(1, this.f139749e) : 0;
                if ((this.f139748d & 2) == 2) {
                    iO += yt.f.o(2, this.f139750f);
                }
                if ((this.f139748d & 8) == 8) {
                    iO += yt.f.h(3, this.f139752h.getNumber());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f139753i.size(); i11++) {
                    iP += yt.f.p(this.f139753i.get(i11).intValue());
                }
                int iP2 = iO + iP;
                if (!J().isEmpty()) {
                    iP2 = iP2 + 1 + yt.f.p(iP);
                }
                this.f139754j = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f139755k.size(); i12++) {
                    iP3 += yt.f.p(this.f139755k.get(i12).intValue());
                }
                int iD = iP2 + iP3;
                if (!E().isEmpty()) {
                    iD = iD + 1 + yt.f.p(iP3);
                }
                this.f139756l = iP3;
                if ((this.f139748d & 4) == 4) {
                    iD += yt.f.d(6, H());
                }
                int size = iD + this.f139747c.size();
                this.f139758n = size;
                return size;
            }

            @Override // yt.r
            public final boolean isInitialized() {
                byte b10 = this.f139757m;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f139757m = (byte) 1;
                return true;
            }

            @Override // yt.r
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return f139745o;
            }

            public c(i.b bVar) {
                super(bVar);
                this.f139754j = -1;
                this.f139756l = -1;
                this.f139757m = (byte) -1;
                this.f139758n = -1;
                this.f139747c = bVar.g();
            }

            public c(boolean z10) {
                this.f139754j = -1;
                this.f139756l = -1;
                this.f139757m = (byte) -1;
                this.f139758n = -1;
                this.f139747c = yt.d.f159862b;
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class b extends i.b<c, b> implements ut.e {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f139759c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f139761e;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public List<Integer> f139764h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public List<Integer> f139765i;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f139760d = 1;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Object f139762f = "";

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public EnumC1455c f139763g = EnumC1455c.NONE;

                public b() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f139764h = list;
                    this.f139765i = list;
                    s();
                }

                public static b o() {
                    return new b();
                }

                @Override // yt.r
                public final boolean isInitialized() {
                    return true;
                }

                @Override // yt.q.a
                /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarM = m();
                    if (cVarM.isInitialized()) {
                        return cVarM;
                    }
                    throw yt.a.AbstractC1559a.d(cVarM);
                }

                public c m() {
                    c cVar = new c(this);
                    int i10 = this.f139759c;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f139749e = this.f139760d;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f139750f = this.f139761e;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f139751g = this.f139762f;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f139752h = this.f139763g;
                    if ((this.f139759c & 16) == 16) {
                        this.f139764h = Collections.unmodifiableList(this.f139764h);
                        this.f139759c &= -17;
                    }
                    cVar.f139753i = this.f139764h;
                    if ((this.f139759c & 32) == 32) {
                        this.f139765i = Collections.unmodifiableList(this.f139765i);
                        this.f139759c &= -33;
                    }
                    cVar.f139755k = this.f139765i;
                    cVar.f139748d = i11;
                    return cVar;
                }

                @Override // yt.i.b
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b m() {
                    return o().i(m());
                }

                public final void p() {
                    if ((this.f139759c & 32) != 32) {
                        this.f139765i = new ArrayList(this.f139765i);
                        this.f139759c |= 32;
                    }
                }

                public final void q() {
                    if ((this.f139759c & 16) != 16) {
                        this.f139764h = new ArrayList(this.f139764h);
                        this.f139759c |= 16;
                    }
                }

                @Override // yt.i.b, yt.r
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public c getDefaultInstanceForType() {
                    return c.y();
                }

                @Override // yt.i.b
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b i(c cVar) {
                    if (cVar == c.y()) {
                        return this;
                    }
                    if (cVar.M()) {
                        x(cVar.C());
                    }
                    if (cVar.L()) {
                        w(cVar.B());
                    }
                    if (cVar.N()) {
                        this.f139759c |= 4;
                        this.f139762f = cVar.f139751g;
                    }
                    if (cVar.K()) {
                        v(cVar.A());
                    }
                    if (!cVar.f139753i.isEmpty()) {
                        if (this.f139764h.isEmpty()) {
                            this.f139764h = cVar.f139753i;
                            this.f139759c &= -17;
                        } else {
                            q();
                            this.f139764h.addAll(cVar.f139753i);
                        }
                    }
                    if (!cVar.f139755k.isEmpty()) {
                        if (this.f139765i.isEmpty()) {
                            this.f139765i = cVar.f139755k;
                            this.f139759c &= -33;
                        } else {
                            p();
                            this.f139765i.addAll(cVar.f139755k);
                        }
                    }
                    j(g().b(cVar.f139747c));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // yt.a.AbstractC1559a
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b c(yt.e eVar, g gVar) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c cVarC = c.f139746p.c(eVar, gVar);
                            if (cVarC != null) {
                                i(cVarC);
                            }
                            return this;
                        } catch (k e10) {
                            c cVar2 = (c) e10.d();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                cVar = cVar2;
                                if (cVar != null) {
                                    i(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (cVar != null) {
                            i(cVar);
                        }
                        throw th;
                    }
                }

                public b v(EnumC1455c enumC1455c) {
                    enumC1455c.getClass();
                    this.f139759c |= 8;
                    this.f139763g = enumC1455c;
                    return this;
                }

                public b w(int i10) {
                    this.f139759c |= 2;
                    this.f139761e = i10;
                    return this;
                }

                public b x(int i10) {
                    this.f139759c |= 1;
                    this.f139760d = i10;
                    return this;
                }

                private void s() {
                }
            }

            public c(yt.e eVar, g gVar) throws k {
                this.f139754j = -1;
                this.f139756l = -1;
                this.f139757m = (byte) -1;
                this.f139758n = -1;
                O();
                yt.d.b bVarP = yt.d.p();
                yt.f fVarJ = yt.f.J(bVarP, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f139748d |= 1;
                                    this.f139749e = eVar.s();
                                } else if (iK == 16) {
                                    this.f139748d |= 2;
                                    this.f139750f = eVar.s();
                                } else if (iK == 24) {
                                    int iN = eVar.n();
                                    EnumC1455c enumC1455cA = EnumC1455c.a(iN);
                                    if (enumC1455cA == null) {
                                        fVarJ.o0(iK);
                                        fVarJ.o0(iN);
                                    } else {
                                        this.f139748d |= 8;
                                        this.f139752h = enumC1455cA;
                                    }
                                } else if (iK == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f139753i = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f139753i.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 34) {
                                    int iJ = eVar.j(eVar.A());
                                    if ((i10 & 16) != 16 && eVar.e() > 0) {
                                        this.f139753i = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f139753i.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                } else if (iK == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f139755k = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f139755k.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 42) {
                                    int iJ2 = eVar.j(eVar.A());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f139755k = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f139755k.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ2);
                                } else if (iK != 50) {
                                    if (!l(eVar, fVarJ, gVar, iK)) {
                                    }
                                } else {
                                    yt.d dVarL = eVar.l();
                                    this.f139748d |= 4;
                                    this.f139751g = dVarL;
                                }
                            }
                            z10 = true;
                        } catch (k e10) {
                            throw e10.n(this);
                        } catch (IOException e11) {
                            throw new k(e11.getMessage()).n(this);
                        }
                    } catch (Throwable th2) {
                        if ((i10 & 16) == 16) {
                            this.f139753i = Collections.unmodifiableList(this.f139753i);
                        }
                        if ((i10 & 32) == 32) {
                            this.f139755k = Collections.unmodifiableList(this.f139755k);
                        }
                        try {
                            fVarJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f139747c = bVarP.k();
                        }
                        i();
                        throw th2;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f139753i = Collections.unmodifiableList(this.f139753i);
                }
                if ((i10 & 32) == 32) {
                    this.f139755k = Collections.unmodifiableList(this.f139755k);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f139747c = bVarP.k();
                }
                i();
            }
        }

        public e(i.b bVar) {
            super(bVar);
            this.f139739f = -1;
            this.f139740g = (byte) -1;
            this.f139741h = -1;
            this.f139736c = bVar.g();
        }

        public e(boolean z10) {
            this.f139739f = -1;
            this.f139740g = (byte) -1;
            this.f139741h = -1;
            this.f139736c = yt.d.f159862b;
        }

        public e(yt.e eVar, g gVar) throws k {
            this.f139739f = -1;
            this.f139740g = (byte) -1;
            this.f139741h = -1;
            w();
            yt.d.b bVarP = yt.d.p();
            yt.f fVarJ = yt.f.J(bVarP, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f139737d = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f139737d.add((c) eVar.u(c.f139746p, gVar));
                            } else if (iK == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f139738e = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f139738e.add(Integer.valueOf(eVar.s()));
                            } else if (iK != 42) {
                                if (!l(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                int iJ = eVar.j(eVar.A());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f139738e = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f139738e.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.n(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).n(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) == 1) {
                        this.f139737d = Collections.unmodifiableList(this.f139737d);
                    }
                    if ((i10 & 2) == 2) {
                        this.f139738e = Collections.unmodifiableList(this.f139738e);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f139736c = bVarP.k();
                    }
                    i();
                    throw th2;
                }
            }
            if ((i10 & 1) == 1) {
                this.f139737d = Collections.unmodifiableList(this.f139737d);
            }
            if ((i10 & 2) == 2) {
                this.f139738e = Collections.unmodifiableList(this.f139738e);
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f139736c = bVarP.k();
            }
            i();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b extends i.b<e, b> implements f {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f139742c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public List<c> f139743d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public List<Integer> f139744e;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f139743d = list;
                this.f139744e = list;
                s();
            }

            public static b o() {
                return new b();
            }

            @Override // yt.r
            public final boolean isInitialized() {
                return true;
            }

            @Override // yt.q.a
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public e build() {
                e eVarM = m();
                if (eVarM.isInitialized()) {
                    return eVarM;
                }
                throw yt.a.AbstractC1559a.d(eVarM);
            }

            public e m() {
                e eVar = new e(this);
                if ((this.f139742c & 1) == 1) {
                    this.f139743d = Collections.unmodifiableList(this.f139743d);
                    this.f139742c &= -2;
                }
                eVar.f139737d = this.f139743d;
                if ((this.f139742c & 2) == 2) {
                    this.f139744e = Collections.unmodifiableList(this.f139744e);
                    this.f139742c &= -3;
                }
                eVar.f139738e = this.f139744e;
                return eVar;
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().i(m());
            }

            public final void p() {
                if ((this.f139742c & 2) != 2) {
                    this.f139744e = new ArrayList(this.f139744e);
                    this.f139742c |= 2;
                }
            }

            public final void q() {
                if ((this.f139742c & 1) != 1) {
                    this.f139743d = new ArrayList(this.f139743d);
                    this.f139742c |= 1;
                }
            }

            @Override // yt.i.b, yt.r
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public e getDefaultInstanceForType() {
                return e.s();
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b i(e eVar) {
                if (eVar == e.s()) {
                    return this;
                }
                if (!eVar.f139737d.isEmpty()) {
                    if (this.f139743d.isEmpty()) {
                        this.f139743d = eVar.f139737d;
                        this.f139742c &= -2;
                    } else {
                        q();
                        this.f139743d.addAll(eVar.f139737d);
                    }
                }
                if (!eVar.f139738e.isEmpty()) {
                    if (this.f139744e.isEmpty()) {
                        this.f139744e = eVar.f139738e;
                        this.f139742c &= -3;
                    } else {
                        p();
                        this.f139744e.addAll(eVar.f139738e);
                    }
                }
                j(g().b(eVar.f139736c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // yt.a.AbstractC1559a
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b c(yt.e eVar, g gVar) throws Throwable {
                e eVar2 = null;
                try {
                    try {
                        e eVarC = e.f139735j.c(eVar, gVar);
                        if (eVarC != null) {
                            i(eVarC);
                        }
                        return this;
                    } catch (k e10) {
                        e eVar3 = (e) e10.d();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            eVar2 = eVar3;
                            if (eVar2 != null) {
                                i(eVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (eVar2 != null) {
                        i(eVar2);
                    }
                    throw th;
                }
            }

            private void s() {
            }
        }
    }

    static {
        rt.a.d dVarD = rt.a.d.D();
        c cVarR = c.r();
        c cVarR2 = c.r();
        z.b bVar = z.b.f159994n;
        f139681a = i.k(dVarD, cVarR, cVarR2, null, 100, bVar, c.class);
        f139682b = i.k(rt.a.i.X(), c.r(), c.r(), null, 100, bVar, c.class);
        rt.a.i iVarX = rt.a.i.X();
        z.b bVar2 = z.b.f159988h;
        f139683c = i.k(iVarX, 0, null, null, 101, bVar2, Integer.class);
        f139684d = i.k(rt.a.n.V(), d.u(), d.u(), null, 100, bVar, d.class);
        f139685e = i.k(rt.a.n.V(), 0, null, null, 101, bVar2, Integer.class);
        f139686f = i.j(rt.a.q.U(), rt.a.b.v(), null, 100, bVar, false, rt.a.b.class);
        f139687g = i.k(rt.a.q.U(), Boolean.FALSE, null, null, 101, z.b.f159991k, Boolean.class);
        f139688h = i.j(rt.a.s.H(), rt.a.b.v(), null, 100, bVar, false, rt.a.b.class);
        f139689i = i.k(rt.a.c.w0(), 0, null, null, 101, bVar2, Integer.class);
        f139690j = i.j(rt.a.c.w0(), rt.a.n.V(), null, 102, bVar, false, rt.a.n.class);
        f139691k = i.k(rt.a.c.w0(), 0, null, null, 103, bVar2, Integer.class);
        f139692l = i.k(rt.a.c.w0(), 0, null, null, 104, bVar2, Integer.class);
        f139693m = i.k(rt.a.l.H(), 0, null, null, 101, bVar2, Integer.class);
        f139694n = i.j(rt.a.l.H(), rt.a.n.V(), null, 102, bVar, false, rt.a.n.class);
    }

    public static void a(g gVar) {
        gVar.a(f139681a);
        gVar.a(f139682b);
        gVar.a(f139683c);
        gVar.a(f139684d);
        gVar.a(f139685e);
        gVar.a(f139686f);
        gVar.a(f139687g);
        gVar.a(f139688h);
        gVar.a(f139689i);
        gVar.a(f139690j);
        gVar.a(f139691k);
        gVar.a(f139692l);
        gVar.a(f139693m);
        gVar.a(f139694n);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends i implements ut.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f139695i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static s<b> f139696j = new C1449a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yt.d f139697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f139699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f139700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f139701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f139702h;

        /* JADX INFO: renamed from: ut.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1449a extends yt.b<b> {
            @Override // yt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b c(yt.e eVar, g gVar) throws k {
                return new b(eVar, gVar);
            }
        }

        static {
            b bVar = new b(true);
            f139695i = bVar;
            bVar.x();
        }

        public static b r() {
            return f139695i;
        }

        private void x() {
            this.f139699e = 0;
            this.f139700f = 0;
        }

        public static C1450b y() {
            return C1450b.o();
        }

        public static C1450b z(b bVar) {
            return y().i(bVar);
        }

        @Override // yt.q
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C1450b newBuilderForType() {
            return y();
        }

        @Override // yt.q
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public C1450b toBuilder() {
            return z(this);
        }

        @Override // yt.q
        public void a(yt.f fVar) throws IOException {
            getSerializedSize();
            if ((this.f139698d & 1) == 1) {
                fVar.a0(1, this.f139699e);
            }
            if ((this.f139698d & 2) == 2) {
                fVar.a0(2, this.f139700f);
            }
            fVar.i0(this.f139697c);
        }

        @Override // yt.i, yt.q
        public s<b> getParserForType() {
            return f139696j;
        }

        @Override // yt.q
        public int getSerializedSize() {
            int i10 = this.f139702h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f139698d & 1) == 1 ? yt.f.o(1, this.f139699e) : 0;
            if ((this.f139698d & 2) == 2) {
                iO += yt.f.o(2, this.f139700f);
            }
            int size = iO + this.f139697c.size();
            this.f139702h = size;
            return size;
        }

        @Override // yt.r
        public final boolean isInitialized() {
            byte b10 = this.f139701g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f139701g = (byte) 1;
            return true;
        }

        @Override // yt.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b getDefaultInstanceForType() {
            return f139695i;
        }

        public int t() {
            return this.f139700f;
        }

        public int u() {
            return this.f139699e;
        }

        public boolean v() {
            return (this.f139698d & 2) == 2;
        }

        public boolean w() {
            return (this.f139698d & 1) == 1;
        }

        public b(i.b bVar) {
            super(bVar);
            this.f139701g = (byte) -1;
            this.f139702h = -1;
            this.f139697c = bVar.g();
        }

        public b(boolean z10) {
            this.f139701g = (byte) -1;
            this.f139702h = -1;
            this.f139697c = yt.d.f159862b;
        }

        public b(yt.e eVar, g gVar) throws k {
            this.f139701g = (byte) -1;
            this.f139702h = -1;
            x();
            yt.d.b bVarP = yt.d.p();
            yt.f fVarJ = yt.f.J(bVarP, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f139698d |= 1;
                                this.f139699e = eVar.s();
                            } else if (iK != 16) {
                                if (!l(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                this.f139698d |= 2;
                                this.f139700f = eVar.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            fVarJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f139697c = bVarP.k();
                        }
                        i();
                        throw th2;
                    }
                } catch (k e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new k(e11.getMessage()).n(this);
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f139697c = bVarP.k();
            }
            i();
        }

        /* JADX INFO: renamed from: ut.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1450b extends i.b<b, C1450b> implements ut.b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f139703c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f139704d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f139705e;

            public C1450b() {
                q();
            }

            public static C1450b o() {
                return new C1450b();
            }

            @Override // yt.r
            public final boolean isInitialized() {
                return true;
            }

            @Override // yt.q.a
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarM = m();
                if (bVarM.isInitialized()) {
                    return bVarM;
                }
                throw yt.a.AbstractC1559a.d(bVarM);
            }

            public b m() {
                b bVar = new b(this);
                int i10 = this.f139703c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f139699e = this.f139704d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f139700f = this.f139705e;
                bVar.f139698d = i11;
                return bVar;
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C1450b m() {
                return o().i(m());
            }

            @Override // yt.i.b, yt.r
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public b getDefaultInstanceForType() {
                return b.r();
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C1450b i(b bVar) {
                if (bVar == b.r()) {
                    return this;
                }
                if (bVar.w()) {
                    u(bVar.u());
                }
                if (bVar.v()) {
                    t(bVar.t());
                }
                j(g().b(bVar.f139697c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // yt.a.AbstractC1559a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public C1450b c(yt.e eVar, g gVar) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b bVarC = b.f139696j.c(eVar, gVar);
                        if (bVarC != null) {
                            i(bVarC);
                        }
                        return this;
                    } catch (k e10) {
                        b bVar2 = (b) e10.d();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar2;
                            if (bVar != null) {
                                i(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (bVar != null) {
                        i(bVar);
                    }
                    throw th;
                }
            }

            public C1450b t(int i10) {
                this.f139703c |= 2;
                this.f139705e = i10;
                return this;
            }

            public C1450b u(int i10) {
                this.f139703c |= 1;
                this.f139704d = i10;
                return this;
            }

            private void q() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends i implements ut.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f139706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static s<c> f139707j = new C1451a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yt.d f139708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f139710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f139711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f139712g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f139713h;

        /* JADX INFO: renamed from: ut.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1451a extends yt.b<c> {
            @Override // yt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public c c(yt.e eVar, g gVar) throws k {
                return new c(eVar, gVar);
            }
        }

        static {
            c cVar = new c(true);
            f139706i = cVar;
            cVar.x();
        }

        public static c r() {
            return f139706i;
        }

        private void x() {
            this.f139710e = 0;
            this.f139711f = 0;
        }

        public static b y() {
            return b.o();
        }

        public static b z(c cVar) {
            return y().i(cVar);
        }

        @Override // yt.q
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return y();
        }

        @Override // yt.q
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return z(this);
        }

        @Override // yt.q
        public void a(yt.f fVar) throws IOException {
            getSerializedSize();
            if ((this.f139709d & 1) == 1) {
                fVar.a0(1, this.f139710e);
            }
            if ((this.f139709d & 2) == 2) {
                fVar.a0(2, this.f139711f);
            }
            fVar.i0(this.f139708c);
        }

        @Override // yt.i, yt.q
        public s<c> getParserForType() {
            return f139707j;
        }

        @Override // yt.q
        public int getSerializedSize() {
            int i10 = this.f139713h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f139709d & 1) == 1 ? yt.f.o(1, this.f139710e) : 0;
            if ((this.f139709d & 2) == 2) {
                iO += yt.f.o(2, this.f139711f);
            }
            int size = iO + this.f139708c.size();
            this.f139713h = size;
            return size;
        }

        @Override // yt.r
        public final boolean isInitialized() {
            byte b10 = this.f139712g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f139712g = (byte) 1;
            return true;
        }

        @Override // yt.r
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public c getDefaultInstanceForType() {
            return f139706i;
        }

        public int t() {
            return this.f139711f;
        }

        public int u() {
            return this.f139710e;
        }

        public boolean v() {
            return (this.f139709d & 2) == 2;
        }

        public boolean w() {
            return (this.f139709d & 1) == 1;
        }

        public c(i.b bVar) {
            super(bVar);
            this.f139712g = (byte) -1;
            this.f139713h = -1;
            this.f139708c = bVar.g();
        }

        public c(boolean z10) {
            this.f139712g = (byte) -1;
            this.f139713h = -1;
            this.f139708c = yt.d.f159862b;
        }

        public c(yt.e eVar, g gVar) throws k {
            this.f139712g = (byte) -1;
            this.f139713h = -1;
            x();
            yt.d.b bVarP = yt.d.p();
            yt.f fVarJ = yt.f.J(bVarP, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f139709d |= 1;
                                this.f139710e = eVar.s();
                            } else if (iK != 16) {
                                if (!l(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                this.f139709d |= 2;
                                this.f139711f = eVar.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            fVarJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f139708c = bVarP.k();
                        }
                        i();
                        throw th2;
                    }
                } catch (k e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new k(e11.getMessage()).n(this);
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f139708c = bVarP.k();
            }
            i();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b extends i.b<c, b> implements ut.c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f139714c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f139715d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f139716e;

            public b() {
                q();
            }

            public static b o() {
                return new b();
            }

            @Override // yt.r
            public final boolean isInitialized() {
                return true;
            }

            @Override // yt.q.a
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarM = m();
                if (cVarM.isInitialized()) {
                    return cVarM;
                }
                throw yt.a.AbstractC1559a.d(cVarM);
            }

            public c m() {
                c cVar = new c(this);
                int i10 = this.f139714c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f139710e = this.f139715d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f139711f = this.f139716e;
                cVar.f139709d = i11;
                return cVar;
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().i(m());
            }

            @Override // yt.i.b, yt.r
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return c.r();
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b i(c cVar) {
                if (cVar == c.r()) {
                    return this;
                }
                if (cVar.w()) {
                    u(cVar.u());
                }
                if (cVar.v()) {
                    t(cVar.t());
                }
                j(g().b(cVar.f139708c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // yt.a.AbstractC1559a
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b c(yt.e eVar, g gVar) throws Throwable {
                c cVar = null;
                try {
                    try {
                        c cVarC = c.f139707j.c(eVar, gVar);
                        if (cVarC != null) {
                            i(cVarC);
                        }
                        return this;
                    } catch (k e10) {
                        c cVar2 = (c) e10.d();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            cVar = cVar2;
                            if (cVar != null) {
                                i(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (cVar != null) {
                        i(cVar);
                    }
                    throw th;
                }
            }

            public b t(int i10) {
                this.f139714c |= 2;
                this.f139716e = i10;
                return this;
            }

            public b u(int i10) {
                this.f139714c |= 1;
                this.f139715d = i10;
                return this;
            }

            private void q() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends i implements ut.d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final d f139717l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static s<d> f139718m = new C1452a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yt.d f139719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f139721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f139722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f139723g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f139724h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c f139725i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f139726j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f139727k;

        /* JADX INFO: renamed from: ut.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1452a extends yt.b<d> {
            @Override // yt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public d c(yt.e eVar, g gVar) throws k {
                return new d(eVar, gVar);
            }
        }

        static {
            d dVar = new d(true);
            f139717l = dVar;
            dVar.H();
        }

        private void H() {
            this.f139721e = b.r();
            this.f139722f = c.r();
            this.f139723g = c.r();
            this.f139724h = c.r();
            this.f139725i = c.r();
        }

        public static b I() {
            return b.o();
        }

        public static b J(d dVar) {
            return I().i(dVar);
        }

        public static d u() {
            return f139717l;
        }

        public c A() {
            return this.f139722f;
        }

        public boolean B() {
            return (this.f139720d & 16) == 16;
        }

        public boolean C() {
            return (this.f139720d & 1) == 1;
        }

        public boolean D() {
            return (this.f139720d & 4) == 4;
        }

        public boolean E() {
            return (this.f139720d & 8) == 8;
        }

        public boolean G() {
            return (this.f139720d & 2) == 2;
        }

        @Override // yt.q
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return I();
        }

        @Override // yt.q
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return J(this);
        }

        @Override // yt.q
        public void a(yt.f fVar) throws IOException {
            getSerializedSize();
            if ((this.f139720d & 1) == 1) {
                fVar.d0(1, this.f139721e);
            }
            if ((this.f139720d & 2) == 2) {
                fVar.d0(2, this.f139722f);
            }
            if ((this.f139720d & 4) == 4) {
                fVar.d0(3, this.f139723g);
            }
            if ((this.f139720d & 8) == 8) {
                fVar.d0(4, this.f139724h);
            }
            if ((this.f139720d & 16) == 16) {
                fVar.d0(5, this.f139725i);
            }
            fVar.i0(this.f139719c);
        }

        @Override // yt.i, yt.q
        public s<d> getParserForType() {
            return f139718m;
        }

        @Override // yt.q
        public int getSerializedSize() {
            int i10 = this.f139727k;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f139720d & 1) == 1 ? yt.f.s(1, this.f139721e) : 0;
            if ((this.f139720d & 2) == 2) {
                iS += yt.f.s(2, this.f139722f);
            }
            if ((this.f139720d & 4) == 4) {
                iS += yt.f.s(3, this.f139723g);
            }
            if ((this.f139720d & 8) == 8) {
                iS += yt.f.s(4, this.f139724h);
            }
            if ((this.f139720d & 16) == 16) {
                iS += yt.f.s(5, this.f139725i);
            }
            int size = iS + this.f139719c.size();
            this.f139727k = size;
            return size;
        }

        @Override // yt.r
        public final boolean isInitialized() {
            byte b10 = this.f139726j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f139726j = (byte) 1;
            return true;
        }

        @Override // yt.r
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public d getDefaultInstanceForType() {
            return f139717l;
        }

        public c w() {
            return this.f139725i;
        }

        public b x() {
            return this.f139721e;
        }

        public c y() {
            return this.f139723g;
        }

        public c z() {
            return this.f139724h;
        }

        public d(i.b bVar) {
            super(bVar);
            this.f139726j = (byte) -1;
            this.f139727k = -1;
            this.f139719c = bVar.g();
        }

        public d(boolean z10) {
            this.f139726j = (byte) -1;
            this.f139727k = -1;
            this.f139719c = yt.d.f159862b;
        }

        public d(yt.e eVar, g gVar) throws k {
            this.f139726j = (byte) -1;
            this.f139727k = -1;
            H();
            yt.d.b bVarP = yt.d.p();
            yt.f fVarJ = yt.f.J(bVarP, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                b.C1450b builder = (this.f139720d & 1) == 1 ? this.f139721e.toBuilder() : null;
                                b bVar = (b) eVar.u(b.f139696j, gVar);
                                this.f139721e = bVar;
                                if (builder != null) {
                                    builder.i(bVar);
                                    this.f139721e = builder.m();
                                }
                                this.f139720d |= 1;
                            } else if (iK == 18) {
                                c.b builder2 = (this.f139720d & 2) == 2 ? this.f139722f.toBuilder() : null;
                                c cVar = (c) eVar.u(c.f139707j, gVar);
                                this.f139722f = cVar;
                                if (builder2 != null) {
                                    builder2.i(cVar);
                                    this.f139722f = builder2.m();
                                }
                                this.f139720d |= 2;
                            } else if (iK == 26) {
                                c.b builder3 = (this.f139720d & 4) == 4 ? this.f139723g.toBuilder() : null;
                                c cVar2 = (c) eVar.u(c.f139707j, gVar);
                                this.f139723g = cVar2;
                                if (builder3 != null) {
                                    builder3.i(cVar2);
                                    this.f139723g = builder3.m();
                                }
                                this.f139720d |= 4;
                            } else if (iK == 34) {
                                c.b builder4 = (this.f139720d & 8) == 8 ? this.f139724h.toBuilder() : null;
                                c cVar3 = (c) eVar.u(c.f139707j, gVar);
                                this.f139724h = cVar3;
                                if (builder4 != null) {
                                    builder4.i(cVar3);
                                    this.f139724h = builder4.m();
                                }
                                this.f139720d |= 8;
                            } else if (iK != 42) {
                                if (!l(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                c.b builder5 = (this.f139720d & 16) == 16 ? this.f139725i.toBuilder() : null;
                                c cVar4 = (c) eVar.u(c.f139707j, gVar);
                                this.f139725i = cVar4;
                                if (builder5 != null) {
                                    builder5.i(cVar4);
                                    this.f139725i = builder5.m();
                                }
                                this.f139720d |= 16;
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.n(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).n(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f139719c = bVarP.k();
                    }
                    i();
                    throw th2;
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f139719c = bVarP.k();
            }
            i();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b extends i.b<d, b> implements ut.d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f139728c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public b f139729d = b.r();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public c f139730e = c.r();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public c f139731f = c.r();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public c f139732g = c.r();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public c f139733h = c.r();

            public b() {
                q();
            }

            public static b o() {
                return new b();
            }

            @Override // yt.r
            public final boolean isInitialized() {
                return true;
            }

            @Override // yt.q.a
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public d build() {
                d dVarM = m();
                if (dVarM.isInitialized()) {
                    return dVarM;
                }
                throw yt.a.AbstractC1559a.d(dVarM);
            }

            public d m() {
                d dVar = new d(this);
                int i10 = this.f139728c;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f139721e = this.f139729d;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f139722f = this.f139730e;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f139723g = this.f139731f;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f139724h = this.f139732g;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f139725i = this.f139733h;
                dVar.f139720d = i11;
                return dVar;
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m() {
                return o().i(m());
            }

            @Override // yt.i.b, yt.r
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public d getDefaultInstanceForType() {
                return d.u();
            }

            public b r(c cVar) {
                if ((this.f139728c & 16) != 16 || this.f139733h == c.r()) {
                    this.f139733h = cVar;
                } else {
                    this.f139733h = c.z(this.f139733h).i(cVar).m();
                }
                this.f139728c |= 16;
                return this;
            }

            public b s(b bVar) {
                if ((this.f139728c & 1) != 1 || this.f139729d == b.r()) {
                    this.f139729d = bVar;
                } else {
                    this.f139729d = b.z(this.f139729d).i(bVar).m();
                }
                this.f139728c |= 1;
                return this;
            }

            @Override // yt.i.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b i(d dVar) {
                if (dVar == d.u()) {
                    return this;
                }
                if (dVar.C()) {
                    s(dVar.x());
                }
                if (dVar.G()) {
                    x(dVar.A());
                }
                if (dVar.D()) {
                    v(dVar.y());
                }
                if (dVar.E()) {
                    w(dVar.z());
                }
                if (dVar.B()) {
                    r(dVar.w());
                }
                j(g().b(dVar.f139719c));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // yt.a.AbstractC1559a
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b c(yt.e eVar, g gVar) throws Throwable {
                d dVar = null;
                try {
                    try {
                        d dVarC = d.f139718m.c(eVar, gVar);
                        if (dVarC != null) {
                            i(dVarC);
                        }
                        return this;
                    } catch (k e10) {
                        d dVar2 = (d) e10.d();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            dVar = dVar2;
                            if (dVar != null) {
                                i(dVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (dVar != null) {
                        i(dVar);
                    }
                    throw th;
                }
            }

            public b v(c cVar) {
                if ((this.f139728c & 4) != 4 || this.f139731f == c.r()) {
                    this.f139731f = cVar;
                } else {
                    this.f139731f = c.z(this.f139731f).i(cVar).m();
                }
                this.f139728c |= 4;
                return this;
            }

            public b w(c cVar) {
                if ((this.f139728c & 8) != 8 || this.f139732g == c.r()) {
                    this.f139732g = cVar;
                } else {
                    this.f139732g = c.z(this.f139732g).i(cVar).m();
                }
                this.f139728c |= 8;
                return this;
            }

            public b x(c cVar) {
                if ((this.f139728c & 2) != 2 || this.f139730e == c.r()) {
                    this.f139730e = cVar;
                } else {
                    this.f139730e = c.z(this.f139730e).i(cVar).m();
                }
                this.f139728c |= 2;
                return this;
            }

            private void q() {
            }
        }
    }
}
