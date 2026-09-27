package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;
import sr.c;
import yads.f52;
import yads.g52;
import yads.h52;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@g
public final class SizeConstraint implements Parcelable, h52 {

    @l
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SizeConstraintType f76959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f76960c;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType[], still in use, count: 1, list:
      (r4v3 com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType[]) from 0x002f: INVOKE (r4v3 com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:48)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SizeConstraintType implements g52 {
        FIXED(f52.f148978b),
        FIXED_RATIO(f52.f148979c),
        PREFERRED_RATIO(f52.f148980d);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f52 f76962b;

        static {
            c.c(sizeConstraintTypeArr);
        }

        private SizeConstraintType(f52 f52Var) {
            super(str, i);
            this.f76962b = f52Var;
        }

        public static SizeConstraintType valueOf(String str) {
            return (SizeConstraintType) Enum.valueOf(SizeConstraintType.class, str);
        }

        public static SizeConstraintType[] values() {
            return (SizeConstraintType[]) f76961c.clone();
        }

        public final f52 a() {
            return this.f76962b;
        }
    }

    public SizeConstraint(@l SizeConstraintType sizeConstraintType, float f10) {
        this.f76959b = sizeConstraintType;
        this.f76960c = f10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(SizeConstraint.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.SizeConstraint");
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return getSizeConstraintType() == sizeConstraint.getSizeConstraintType() && getValue() == sizeConstraint.getValue();
    }

    @Override // yads.h52
    public float getValue() {
        return this.f76960c;
    }

    public int hashCode() {
        return Float.floatToIntBits(getValue()) + (getSizeConstraintType().hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i10) {
        parcel.writeString(this.f76959b.name());
        parcel.writeFloat(this.f76960c);
    }

    @Override // yads.h52
    @l
    public SizeConstraintType getSizeConstraintType() {
        return this.f76959b;
    }
}
