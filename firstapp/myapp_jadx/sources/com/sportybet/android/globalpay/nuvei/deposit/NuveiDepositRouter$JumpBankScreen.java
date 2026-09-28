package com.sportybet.android.globalpay.nuvei.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
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

/* JADX INFO: loaded from: classes2.dex */
@ae80
public final class NuveiDepositRouter$JumpBankScreen {
    public static final b Companion = new b();
    public final String a;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/globalpay/nuvei/deposit/NuveiDepositRouter$JumpBankScreen$JumpBankCompleted;", "Landroid/os/Parcelable;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class JumpBankCompleted implements Parcelable {
        public static final JumpBankCompleted a = new JumpBankCompleted();
        public static final Parcelable.Creator<JumpBankCompleted> CREATOR = new a();

        public static final class a implements Parcelable.Creator<JumpBankCompleted> {
            @Override // android.os.Parcelable.Creator
            public final JumpBankCompleted createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return JumpBankCompleted.a;
            }

            @Override // android.os.Parcelable.Creator
            public final JumpBankCompleted[] newArray(int i) {
                return new JumpBankCompleted[i];
            }
        }

        private JumpBankCompleted() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof JumpBankCompleted);
        }

        public final int hashCode() {
            return 855006401;
        }

        public final String toString() {
            return "JumpBankCompleted";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @fae
    public static final /* synthetic */ class a implements o1k<NuveiDepositRouter$JumpBankScreen> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositRouter.JumpBankScreen", aVar, 1);
            kr10Var.j("jumpUrl", false);
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
            return new NuveiDepositRouter$JumpBankScreen(i, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            NuveiDepositRouter$JumpBankScreen nuveiDepositRouter$JumpBankScreen = (NuveiDepositRouter$JumpBankScreen) obj;
            nuveiDepositRouter$JumpBankScreen.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, nuveiDepositRouter$JumpBankScreen.a);
            fmaVarC.b(pd80Var);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b {
        public final php<NuveiDepositRouter$JumpBankScreen> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ NuveiDepositRouter$JumpBankScreen(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NuveiDepositRouter$JumpBankScreen) && Intrinsics.g(this.a, ((NuveiDepositRouter$JumpBankScreen) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("JumpBankScreen(jumpUrl=", this.a, LGxrN.dAZhQNFqpEuiHCN);
    }

    public NuveiDepositRouter$JumpBankScreen(String str) {
        this.a = str;
    }
}
