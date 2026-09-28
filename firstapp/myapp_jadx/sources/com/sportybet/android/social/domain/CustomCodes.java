package com.sportybet.android.social.domain;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a0c;
import defpackage.ae80;
import defpackage.b5d;
import defpackage.cgo;
import defpackage.dma;
import defpackage.f4g;
import defpackage.fae;
import defpackage.fma;
import defpackage.gae0;
import defpackage.jtf0;
import defpackage.kr10;
import defpackage.o1k;
import defpackage.pd80;
import defpackage.php;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/social/domain/CustomCodes;", "Landroid/os/Parcelable;", "La0c;", "Companion", "b", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CustomCodes implements Parcelable, a0c {
    public final String a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<CustomCodes> CREATOR = new c();
    public static final int b = 8;
    public static final CustomCodes c = new CustomCodes("");

    @fae
    public static final /* synthetic */ class a implements o1k<CustomCodes> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.android.social.domain.CustomCodes", aVar, 1);
            kr10Var.j("username", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{gae0.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            String strJ = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else {
                    if (iV != 0) {
                        jtf0.a(iV);
                        return null;
                    }
                    strJ = dmaVarC.j(pd80Var, 0);
                    i = 1;
                }
            }
            dmaVarC.b(pd80Var);
            return new CustomCodes(i, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            CustomCodes customCodes = (CustomCodes) obj;
            customCodes.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, customCodes.a);
            fmaVarC.b(pd80Var);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.social.domain.CustomCodes$b, reason: from kotlin metadata */
    public static final class Companion {
        public final php<CustomCodes> serializer() {
            return a.a;
        }
    }

    public static final class c implements Parcelable.Creator<CustomCodes> {
        @Override // android.os.Parcelable.Creator
        public final CustomCodes createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CustomCodes(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomCodes[] newArray(int i) {
            return new CustomCodes[i];
        }
    }

    public /* synthetic */ CustomCodes(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomCodes) && Intrinsics.g(this.a, ((CustomCodes) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("CustomCodes(username=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }

    public CustomCodes(String str) {
        str.getClass();
        this.a = str;
    }
}
