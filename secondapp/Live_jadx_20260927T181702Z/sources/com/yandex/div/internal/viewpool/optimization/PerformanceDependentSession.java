package com.yandex.div.internal.viewpool.optimization;

import bw.f;
import com.yandex.div.core.view2.DivViewCreator;
import cw.e;
import dr.g1;
import dr.o;
import dr.q;
import dw.g2;
import dw.w2;
import f0.a;
import f0.p;
import fr.m1;
import fr.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.d;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import zv.b0;
import zv.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class PerformanceDependentSession {

    @l
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final <T> a<String, T> prepare(@l a<String, T> aVar, @l ds.a<? extends T> aVar2) {
            for (String str : DivViewCreator.Companion.getTAGS()) {
                aVar.put(str, aVar2.invoke());
            }
            return aVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Detailed extends PerformanceDependentSession {

        @l
        private final a<String, List<ViewObtainment>> viewObtainments;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @b0
        public static final class ViewObtainment {

            @l
            public static final Companion Companion = new Companion(null);
            private final int availableViews;
            private final boolean isObtainedWithBlock;
            private final long obtainmentDuration;
            private final long obtainmentTime;

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class Companion {
                public /* synthetic */ Companion(x xVar) {
                    this();
                }

                @l
                public final j<ViewObtainment> serializer() {
                    return PerformanceDependentSession$Detailed$ViewObtainment$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @o(level = q.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @g1(expression = "", imports = {}))
            public /* synthetic */ ViewObtainment(int i10, long j10, long j11, int i11, boolean z10, w2 w2Var) {
                if (15 != (i10 & 15)) {
                    g2.b(i10, 15, PerformanceDependentSession$Detailed$ViewObtainment$$serializer.INSTANCE.getDescriptor());
                }
                this.obtainmentTime = j10;
                this.obtainmentDuration = j11;
                this.availableViews = i11;
                this.isObtainedWithBlock = z10;
            }

            public static /* synthetic */ ViewObtainment copy$default(ViewObtainment viewObtainment, long j10, long j11, int i10, boolean z10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j10 = viewObtainment.obtainmentTime;
                }
                long j12 = j10;
                if ((i11 & 2) != 0) {
                    j11 = viewObtainment.obtainmentDuration;
                }
                long j13 = j11;
                if ((i11 & 4) != 0) {
                    i10 = viewObtainment.availableViews;
                }
                int i12 = i10;
                if ((i11 & 8) != 0) {
                    z10 = viewObtainment.isObtainedWithBlock;
                }
                return viewObtainment.copy(j12, j13, i12, z10);
            }

            @cs.o
            public static final /* synthetic */ void write$Self(ViewObtainment viewObtainment, e eVar, f fVar) {
                eVar.j(fVar, 0, viewObtainment.obtainmentTime);
                eVar.j(fVar, 1, viewObtainment.obtainmentDuration);
                eVar.n(fVar, 2, viewObtainment.availableViews);
                eVar.B(fVar, 3, viewObtainment.isObtainedWithBlock);
            }

            public final long component1() {
                return this.obtainmentTime;
            }

            public final long component2() {
                return this.obtainmentDuration;
            }

            public final int component3() {
                return this.availableViews;
            }

            public final boolean component4() {
                return this.isObtainedWithBlock;
            }

            @l
            public final ViewObtainment copy(long j10, long j11, int i10, boolean z10) {
                return new ViewObtainment(j10, j11, i10, z10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ViewObtainment)) {
                    return false;
                }
                ViewObtainment viewObtainment = (ViewObtainment) obj;
                return this.obtainmentTime == viewObtainment.obtainmentTime && this.obtainmentDuration == viewObtainment.obtainmentDuration && this.availableViews == viewObtainment.availableViews && this.isObtainedWithBlock == viewObtainment.isObtainedWithBlock;
            }

            public final int getAvailableViews() {
                return this.availableViews;
            }

            public final long getObtainmentDuration() {
                return this.obtainmentDuration;
            }

            public final long getObtainmentTime() {
                return this.obtainmentTime;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [int] */
            /* JADX WARN: Type inference failed for: r1v4, types: [int] */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v6 */
            public int hashCode() {
                int iA = ((((p.a(this.obtainmentTime) * 31) + p.a(this.obtainmentDuration)) * 31) + this.availableViews) * 31;
                boolean z10 = this.isObtainedWithBlock;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iA + r10;
            }

            public final boolean isObtainedWithBlock() {
                return this.isObtainedWithBlock;
            }

            @l
            public String toString() {
                return "ViewObtainment(obtainmentTime=" + this.obtainmentTime + ", obtainmentDuration=" + this.obtainmentDuration + ", availableViews=" + this.availableViews + ", isObtainedWithBlock=" + this.isObtainedWithBlock + ')';
            }

            public ViewObtainment(long j10, long j11, int i10, boolean z10) {
                this.obtainmentTime = j10;
                this.obtainmentDuration = j11;
                this.availableViews = i10;
                this.isObtainedWithBlock = z10;
            }
        }

        public Detailed() {
            super(null);
            Companion unused = PerformanceDependentSession.Companion;
            a<String, List<ViewObtainment>> aVar = new a<>();
            for (String str : DivViewCreator.Companion.getTAGS()) {
                aVar.put(str, new ArrayList());
            }
            this.viewObtainments = aVar;
        }

        @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession
        public void clear$div_release() {
            Iterator<T> it = this.viewObtainments.values().iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                synchronized (list) {
                    list.clear();
                    dr.w2 w2Var = dr.w2.f79517a;
                }
            }
        }

        @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession
        @l
        public Map<String, ViewObtainmentStatistics> getViewObtainmentStatistics() {
            a<String, List<ViewObtainment>> aVar = this.viewObtainments;
            LinkedHashMap linkedHashMap = new LinkedHashMap(m1.j(aVar.size()));
            Iterator<T> it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                List<ViewObtainment> list = (List) entry.getValue();
                MutableViewObtainmentStatistics mutableViewObtainmentStatistics = new MutableViewObtainmentStatistics();
                for (ViewObtainment viewObtainment : list) {
                    mutableViewObtainmentStatistics.report(viewObtainment.getAvailableViews(), viewObtainment.isObtainedWithBlock());
                }
                linkedHashMap.put(key, mutableViewObtainmentStatistics);
            }
            return linkedHashMap;
        }

        @l
        public final Map<String, List<ViewObtainment>> getViewObtainments() {
            a<String, List<ViewObtainment>> aVar = this.viewObtainments;
            LinkedHashMap linkedHashMap = new LinkedHashMap(m1.j(aVar.size()));
            Iterator<T> it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), r0.a6((List) entry.getValue()));
            }
            return linkedHashMap;
        }

        @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession
        public void viewObtained$div_release(@l String str, long j10, int i10, boolean z10) {
            List<ViewObtainment> list = this.viewObtainments.get(str);
            if (list == null) {
                return;
            }
            ViewObtainment viewObtainment = new ViewObtainment(System.currentTimeMillis(), j10, i10, z10);
            synchronized (list) {
                list.add(viewObtainment);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Lightweight extends PerformanceDependentSession {

        @l
        private final a<String, MutableViewObtainmentStatistics> mutableViewObtainmentStatistics;

        public Lightweight() {
            super(null);
            Companion unused = PerformanceDependentSession.Companion;
            a<String, MutableViewObtainmentStatistics> aVar = new a<>();
            for (String str : DivViewCreator.Companion.getTAGS()) {
                aVar.put(str, new MutableViewObtainmentStatistics());
            }
            this.mutableViewObtainmentStatistics = aVar;
        }

        @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession
        public void clear$div_release() {
            Iterator<T> it = this.mutableViewObtainmentStatistics.values().iterator();
            while (it.hasNext()) {
                ((MutableViewObtainmentStatistics) it.next()).clear();
            }
        }

        @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession
        @l
        public Map<String, ViewObtainmentStatistics> getViewObtainmentStatistics() {
            return this.mutableViewObtainmentStatistics;
        }

        @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession
        public void viewObtained$div_release(@l String str, long j10, int i10, boolean z10) {
            MutableViewObtainmentStatistics mutableViewObtainmentStatistics = this.mutableViewObtainmentStatistics.get(str);
            if (mutableViewObtainmentStatistics != null) {
                mutableViewObtainmentStatistics.report(i10, z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class ViewObtainmentStatistics {
        public /* synthetic */ ViewObtainmentStatistics(x xVar) {
            this();
        }

        public abstract int getMaxSuccessiveBlocked();

        @m
        public abstract Integer getMinUnused();

        @l
        public String toString() {
            return "ViewObtainmentStatistics(maxSuccessiveBlocked=" + getMaxSuccessiveBlocked() + ", minUnused=" + getMinUnused() + ')';
        }

        private ViewObtainmentStatistics() {
        }
    }

    public /* synthetic */ PerformanceDependentSession(x xVar) {
        this();
    }

    @d
    public abstract void clear$div_release();

    @l
    public abstract Map<String, ViewObtainmentStatistics> getViewObtainmentStatistics();

    @d
    public abstract void viewObtained$div_release(@l String str, long j10, int i10, boolean z10);

    private PerformanceDependentSession() {
    }
}
