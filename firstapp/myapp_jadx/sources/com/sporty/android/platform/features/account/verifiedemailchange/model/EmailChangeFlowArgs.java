package com.sporty.android.platform.features.account.verifiedemailchange.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import defpackage.ae80;
import defpackage.b5d;
import defpackage.dma;
import defpackage.f4g;
import defpackage.fae;
import defpackage.fma;
import defpackage.gae0;
import defpackage.gpp;
import defpackage.hxo;
import defpackage.jtf0;
import defpackage.kr10;
import defpackage.ml5;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.o1k;
import defpackage.pd80;
import defpackage.php;
import defpackage.x15;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ae80
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/platform/features/account/verifiedemailchange/model/EmailChangeFlowArgs;", "Landroid/os/Parcelable;", "Companion", "a", "b", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EmailChangeFlowArgs implements Parcelable {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<EmailChangeFlowArgs> CREATOR = new c();

    /* JADX INFO: loaded from: classes5.dex */
    @fae
    public static final /* synthetic */ class a implements o1k<EmailChangeFlowArgs> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs", aVar, 5);
            kr10Var.j("token", true);
            kr10Var.j("maxAttempts", true);
            kr10Var.j("shouldPassOtp", true);
            kr10Var.j("shouldPassPassword", true);
            kr10Var.j("shouldPassPin", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            x15 x15Var = x15.a;
            return new php[]{gae0.a, hxo.a, x15Var, x15Var, x15Var};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            int iM = 0;
            boolean zE = false;
            boolean zE2 = false;
            boolean zE3 = false;
            String strJ = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    iM = dmaVarC.m(pd80Var, 1);
                    i |= 2;
                } else if (iV == 2) {
                    zE = dmaVarC.E(pd80Var, 2);
                    i |= 4;
                } else if (iV == 3) {
                    zE2 = dmaVarC.E(pd80Var, 3);
                    i |= 8;
                } else {
                    if (iV != 4) {
                        jtf0.a(iV);
                        return null;
                    }
                    zE3 = dmaVarC.E(pd80Var, 4);
                    i |= 16;
                }
            }
            dmaVarC.b(pd80Var);
            return new EmailChangeFlowArgs(i, strJ, iM, zE, zE2, zE3);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            EmailChangeFlowArgs emailChangeFlowArgs = (EmailChangeFlowArgs) obj;
            emailChangeFlowArgs.getClass();
            boolean z = emailChangeFlowArgs.e;
            boolean z2 = emailChangeFlowArgs.d;
            boolean z3 = emailChangeFlowArgs.c;
            int i = emailChangeFlowArgs.b;
            String str = emailChangeFlowArgs.a;
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            if (fmaVarC.a(pd80Var) || !Intrinsics.g(str, "")) {
                fmaVarC.o(pd80Var, 0, str);
            }
            if (fmaVarC.a(pd80Var) || i != 1) {
                fmaVarC.A(1, i, pd80Var);
            }
            if (fmaVarC.a(pd80Var) || z3) {
                fmaVarC.i(pd80Var, 2, z3);
            }
            if (fmaVarC.a(pd80Var) || z2) {
                fmaVarC.i(pd80Var, 3, z2);
            }
            if (fmaVarC.a(pd80Var) || z) {
                fmaVarC.i(pd80Var, 4, z);
            }
            fmaVarC.b(pd80Var);
        }
    }

    /* JADX INFO: renamed from: com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs$b, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public final php<EmailChangeFlowArgs> serializer() {
            return a.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c implements Parcelable.Creator<EmailChangeFlowArgs> {
        @Override // android.os.Parcelable.Creator
        public final EmailChangeFlowArgs createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i = parcel.readInt();
            boolean z = false;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new EmailChangeFlowArgs(i, string, z, z2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EmailChangeFlowArgs[] newArray(int i) {
            return new EmailChangeFlowArgs[i];
        }
    }

    public /* synthetic */ EmailChangeFlowArgs(int i, String str, int i2, boolean z, boolean z2, boolean z3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z3;
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
        if (!(obj instanceof EmailChangeFlowArgs)) {
            return false;
        }
        EmailChangeFlowArgs emailChangeFlowArgs = (EmailChangeFlowArgs) obj;
        return Intrinsics.g(this.a, emailChangeFlowArgs.a) && this.b == emailChangeFlowArgs.b && this.c == emailChangeFlowArgs.c && this.d == emailChangeFlowArgs.d && this.e == emailChangeFlowArgs.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(mtg0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "EmailChangeFlowArgs(token=", this.a, ", maxAttempts=", ", shouldPassOtp=");
        nng.a(", shouldPassPassword=", ", shouldPassPin=", sbA, this.c, this.d);
        return mq0.a(sbA, this.e, dqvOSm.LiHByKxfJEsTPV);
    }

    public EmailChangeFlowArgs() {
        this(0);
    }

    public EmailChangeFlowArgs(int i, String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public /* synthetic */ EmailChangeFlowArgs(int i) {
        this(1, "", false, false, false);
    }
}
