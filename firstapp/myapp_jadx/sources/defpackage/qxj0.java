package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class qxj0 {
    public static final LinkedHashSet a(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new lxa.a(z, uri));
                    }
                    Unit unit = Unit.a;
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            Unit unit2 = Unit.a;
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ft7.a(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final nt1 b(int i) {
        if (i == 0) {
            return nt1.a;
        }
        if (i == 1) {
            return nt1.b;
        }
        hb5.a(pe4.b(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final sox c(int i) {
        if (i == 0) {
            return sox.a;
        }
        if (i == 1) {
            return sox.b;
        }
        if (i == 2) {
            return sox.c;
        }
        if (i == 3) {
            return sox.d;
        }
        if (i == 4) {
            return sox.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return sox.f;
        }
        hb5.a(pe4.b(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final x7z d(int i) {
        if (i == 0) {
            return x7z.a;
        }
        if (i == 1) {
            return x7z.b;
        }
        hb5.a(pe4.b(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final jvj0 e(int i) {
        if (i == 0) {
            return jvj0.a;
        }
        if (i == 1) {
            return jvj0.b;
        }
        if (i == 2) {
            return jvj0.c;
        }
        if (i == 3) {
            return jvj0.d;
        }
        if (i == 4) {
            return jvj0.e;
        }
        if (i == 5) {
            return jvj0.f;
        }
        hb5.a(pe4.b(i, "Could not convert ", " to State"));
        return null;
    }

    public static final int f(jvj0 jvj0Var) {
        jvj0Var.getClass();
        int iOrdinal = jvj0Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        uhc.a();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final ynx g(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new ynx(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                ynx ynxVarA = unx.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return ynxVarA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ft7.a(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }
}
