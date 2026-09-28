package com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ae80;
import defpackage.b5d;
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
import defpackage.tzx;
import defpackage.x15;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ae80
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/platform/features/account/verifiedemailchange/verifyidentity/model/EmailChangeVerifyIdentityArgs;", "Landroid/os/Parcelable;", "Companion", "a", "b", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EmailChangeVerifyIdentityArgs implements Parcelable {
    public final String a;
    public final boolean b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<EmailChangeVerifyIdentityArgs> CREATOR = new c();

    @fae
    public static final /* synthetic */ class a implements o1k<EmailChangeVerifyIdentityArgs> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs", aVar, 2);
            kr10Var.j("token", true);
            kr10Var.j("shouldPassOtp", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{gae0.a, x15.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strJ = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    zE = dmaVarC.E(pd80Var, 1);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new EmailChangeVerifyIdentityArgs(i, strJ, zE);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs = (EmailChangeVerifyIdentityArgs) obj;
            emailChangeVerifyIdentityArgs.getClass();
            boolean z = emailChangeVerifyIdentityArgs.b;
            String str = emailChangeVerifyIdentityArgs.a;
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            if (fmaVarC.a(pd80Var) || !Intrinsics.g(str, "")) {
                fmaVarC.o(pd80Var, 0, str);
            }
            if (fmaVarC.a(pd80Var) || z) {
                fmaVarC.i(pd80Var, 1, z);
            }
            fmaVarC.b(pd80Var);
        }
    }

    /* JADX INFO: renamed from: com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs$b, reason: from kotlin metadata */
    public static final class Companion {
        public final php<EmailChangeVerifyIdentityArgs> serializer() {
            return a.a;
        }
    }

    public static final class c implements Parcelable.Creator<EmailChangeVerifyIdentityArgs> {
        @Override // android.os.Parcelable.Creator
        public final EmailChangeVerifyIdentityArgs createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EmailChangeVerifyIdentityArgs(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EmailChangeVerifyIdentityArgs[] newArray(int i) {
            return new EmailChangeVerifyIdentityArgs[i];
        }
    }

    public /* synthetic */ EmailChangeVerifyIdentityArgs(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
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
        if (!(obj instanceof EmailChangeVerifyIdentityArgs)) {
            return false;
        }
        EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs = (EmailChangeVerifyIdentityArgs) obj;
        return Intrinsics.g(this.a, emailChangeVerifyIdentityArgs.a) && this.b == emailChangeVerifyIdentityArgs.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tzx.a("EmailChangeVerifyIdentityArgs(token=", this.a, ", shouldPassOtp=", ")", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public EmailChangeVerifyIdentityArgs(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public EmailChangeVerifyIdentityArgs() {
        this("", false);
    }
}
