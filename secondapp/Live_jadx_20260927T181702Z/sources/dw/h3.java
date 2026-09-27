package dw;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@zv.i
@kotlin.jvm.internal.s1({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
public abstract class h3<Tag> implements cw.h, cw.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final ArrayList<Tag> f79575a = new ArrayList<>();

    private final boolean I(bw.f fVar, int i10) {
        c0(a0(fVar, i10));
        return true;
    }

    @Override // cw.e
    public final void A(@oy.l bw.f descriptor, int i10, double d10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        M(a0(descriptor, i10), d10);
    }

    @Override // cw.e
    public final void B(@oy.l bw.f descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        J(a0(descriptor, i10), z10);
    }

    @Override // cw.h
    public final void C(char c10) {
        L(b0(), c10);
    }

    @Override // cw.h
    public void D() {
        S(Y());
    }

    @Override // cw.h
    public final void E(@oy.l bw.f enumDescriptor, int i10) {
        kotlin.jvm.internal.m0.p(enumDescriptor, "enumDescriptor");
        N(b0(), enumDescriptor, i10);
    }

    @Override // cw.e
    public final void F(@oy.l bw.f descriptor, int i10, float f10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        O(a0(descriptor, i10), f10);
    }

    @Override // cw.e
    @oy.l
    public final cw.h G(@oy.l bw.f descriptor, int i10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        return P(a0(descriptor, i10), descriptor.d(i10));
    }

    @Override // cw.e
    public final void H(@oy.l bw.f descriptor, int i10, char c10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        L(a0(descriptor, i10), c10);
    }

    public void J(Tag tag, boolean z10) {
        W(tag, Boolean.valueOf(z10));
    }

    public void K(Tag tag, byte b10) {
        W(tag, Byte.valueOf(b10));
    }

    public void L(Tag tag, char c10) {
        W(tag, Character.valueOf(c10));
    }

    public void M(Tag tag, double d10) {
        W(tag, Double.valueOf(d10));
    }

    public void N(Tag tag, @oy.l bw.f enumDescriptor, int i10) {
        kotlin.jvm.internal.m0.p(enumDescriptor, "enumDescriptor");
        W(tag, Integer.valueOf(i10));
    }

    public void O(Tag tag, float f10) {
        W(tag, Float.valueOf(f10));
    }

    @oy.l
    public cw.h P(Tag tag, @oy.l bw.f inlineDescriptor) {
        kotlin.jvm.internal.m0.p(inlineDescriptor, "inlineDescriptor");
        c0(tag);
        return this;
    }

    public void Q(Tag tag, int i10) {
        W(tag, Integer.valueOf(i10));
    }

    public void R(Tag tag, long j10) {
        W(tag, Long.valueOf(j10));
    }

    public void T(Tag tag) {
        throw new zv.c0("null is not supported");
    }

    public void U(Tag tag, short s10) {
        W(tag, Short.valueOf(s10));
    }

    public void V(Tag tag, @oy.l String value) {
        kotlin.jvm.internal.m0.p(value, "value");
        W(tag, value);
    }

    public void W(Tag tag, @oy.l Object value) {
        kotlin.jvm.internal.m0.p(value, "value");
        throw new zv.c0("Non-serializable " + kotlin.jvm.internal.m1.d(value.getClass()) + " is not supported by " + kotlin.jvm.internal.m1.d(getClass()) + " encoder");
    }

    public void X(@oy.l bw.f descriptor) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
    }

    public final Tag Y() {
        return (Tag) fr.r0.u3(this.f79575a);
    }

    @oy.m
    public final Tag Z() {
        return (Tag) fr.r0.A3(this.f79575a);
    }

    @Override // cw.h, cw.e
    @oy.l
    public gw.f a() {
        return gw.h.a();
    }

    public abstract Tag a0(@oy.l bw.f fVar, int i10);

    @Override // cw.h
    @oy.l
    public cw.e b(@oy.l bw.f descriptor) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        return this;
    }

    public final Tag b0() {
        if (this.f79575a.isEmpty()) {
            throw new zv.c0("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f79575a;
        return arrayList.remove(fr.h0.L(arrayList));
    }

    @Override // cw.e
    public final void c(@oy.l bw.f descriptor) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        if (!this.f79575a.isEmpty()) {
            b0();
        }
        X(descriptor);
    }

    public final void c0(Tag tag) {
        this.f79575a.add(tag);
    }

    @Override // cw.h
    public final void e(byte b10) {
        K(b0(), b10);
    }

    @Override // cw.e
    public <T> void f(@oy.l bw.f descriptor, int i10, @oy.l zv.d0<? super T> serializer, T t10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        kotlin.jvm.internal.m0.p(serializer, "serializer");
        if (I(descriptor, i10)) {
            t(serializer, t10);
        }
    }

    @Override // cw.h
    @oy.l
    public cw.e g(@oy.l bw.f fVar, int i10) {
        return cw.h.a.a(this, fVar, i10);
    }

    @Override // cw.e
    public final void h(@oy.l bw.f descriptor, int i10, byte b10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        K(a0(descriptor, i10), b10);
    }

    @Override // cw.e
    public <T> void i(@oy.l bw.f descriptor, int i10, @oy.l zv.d0<? super T> serializer, @oy.m T t10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        kotlin.jvm.internal.m0.p(serializer, "serializer");
        if (I(descriptor, i10)) {
            o(serializer, t10);
        }
    }

    @Override // cw.e
    public final void j(@oy.l bw.f descriptor, int i10, long j10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        R(a0(descriptor, i10), j10);
    }

    @Override // cw.h
    public final void k(short s10) {
        U(b0(), s10);
    }

    @Override // cw.h
    public final void l(boolean z10) {
        J(b0(), z10);
    }

    @Override // cw.h
    public final void m(float f10) {
        O(b0(), f10);
    }

    @Override // cw.e
    public final void n(@oy.l bw.f descriptor, int i10, int i11) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        Q(a0(descriptor, i10), i11);
    }

    @Override // cw.h
    @zv.g
    public <T> void o(@oy.l zv.d0<? super T> d0Var, @oy.m T t10) {
        cw.h.a.c(this, d0Var, t10);
    }

    @Override // cw.h
    @oy.l
    public cw.h p(@oy.l bw.f descriptor) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        return P(b0(), descriptor);
    }

    @Override // cw.e
    @zv.g
    public boolean q(@oy.l bw.f fVar, int i10) {
        return cw.e.a.a(this, fVar, i10);
    }

    @Override // cw.h
    public final void s(int i10) {
        Q(b0(), i10);
    }

    @Override // cw.h
    public <T> void t(@oy.l zv.d0<? super T> d0Var, T t10) {
        cw.h.a.d(this, d0Var, t10);
    }

    @Override // cw.h
    public final void u(@oy.l String value) {
        kotlin.jvm.internal.m0.p(value, "value");
        V(b0(), value);
    }

    @Override // cw.e
    public final void v(@oy.l bw.f descriptor, int i10, @oy.l String value) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        kotlin.jvm.internal.m0.p(value, "value");
        V(a0(descriptor, i10), value);
    }

    @Override // cw.h
    public final void w(double d10) {
        M(b0(), d10);
    }

    @Override // cw.e
    public final void x(@oy.l bw.f descriptor, int i10, short s10) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        U(a0(descriptor, i10), s10);
    }

    @Override // cw.h
    public final void y(long j10) {
        R(b0(), j10);
    }

    @Override // cw.h
    public void z() {
        T(b0());
    }

    public void S(Tag tag) {
    }
}
