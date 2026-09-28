package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bbe0;
import defpackage.epx;
import defpackage.gq40;
import defpackage.ib5;
import defpackage.pe4;
import defpackage.x5a0;
import defpackage.y5a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Lx5a0;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ParcelableSnapshotMutableState<T> extends x5a0<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        epx epxVar = epx.a;
        y5a0<T> y5a0Var = this.b;
        if (Intrinsics.g(y5a0Var, epxVar)) {
            i2 = 0;
        } else if (Intrinsics.g(y5a0Var, bbe0.b)) {
            i2 = 1;
        } else {
            if (!Intrinsics.g(y5a0Var, gq40.b)) {
                ib5.a("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
            y5a0 y5a0Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                y5a0Var = epx.a;
            } else if (i == 1) {
                y5a0Var = bbe0.b;
            } else {
                if (i != 2) {
                    ib5.a(pe4.b(i, "Unsupported MutableState policy ", " was restored"));
                    return null;
                }
                y5a0Var = gq40.b;
            }
            return new ParcelableSnapshotMutableState(value, y5a0Var);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
