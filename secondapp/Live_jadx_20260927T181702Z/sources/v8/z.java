package v8;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@j8.q.e
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final List<Uri> f140298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final InputEvent f140299b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nSourceRegistrationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceRegistrationRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final List<Uri> f140300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public InputEvent f140301b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@oy.l List<? extends Uri> registrationUris) {
            kotlin.jvm.internal.m0.p(registrationUris, "registrationUris");
            this.f140300a = registrationUris;
        }

        @oy.l
        public final z a() {
            return new z(this.f140300a, this.f140301b);
        }

        @oy.l
        public final a b(@oy.l InputEvent inputEvent) {
            kotlin.jvm.internal.m0.p(inputEvent, "inputEvent");
            this.f140301b = inputEvent;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@oy.l List<? extends Uri> registrationUris, @oy.m InputEvent inputEvent) {
        kotlin.jvm.internal.m0.p(registrationUris, "registrationUris");
        this.f140298a = registrationUris;
        this.f140299b = inputEvent;
    }

    @oy.m
    public final InputEvent a() {
        return this.f140299b;
    }

    @oy.l
    public final List<Uri> b() {
        return this.f140298a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m0.g(this.f140298a, zVar.f140298a) && kotlin.jvm.internal.m0.g(this.f140299b, zVar.f140299b);
    }

    public int hashCode() {
        int iHashCode = this.f140298a.hashCode();
        InputEvent inputEvent = this.f140299b;
        return inputEvent != null ? (iHashCode * 31) + inputEvent.hashCode() : iHashCode;
    }

    @oy.l
    public String toString() {
        return "AppSourcesRegistrationRequest { " + ("RegistrationUris=[" + this.f140298a + "], InputEvent=" + this.f140299b) + " }";
    }

    public /* synthetic */ z(List list, InputEvent inputEvent, int i10, kotlin.jvm.internal.x xVar) {
        this(list, (i10 & 2) != 0 ? null : inputEvent);
    }
}
