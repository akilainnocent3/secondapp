package oa;

import a9.z2;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.e0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f118970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f118971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f118972d;

        static {
            int[] iArr = new int[androidx.work.x.values().length];
            f118972d = iArr;
            try {
                iArr[androidx.work.x.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118972d[androidx.work.x.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.s.values().length];
            f118971c = iArr2;
            try {
                iArr2[androidx.work.s.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f118971c[androidx.work.s.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f118971c[androidx.work.s.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f118971c[androidx.work.s.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f118971c[androidx.work.s.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.a.values().length];
            f118970b = iArr3;
            try {
                iArr3[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f118970b[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[e0.a.values().length];
            f118969a = iArr4;
            try {
                iArr4[e0.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f118969a[e0.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f118969a[e0.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f118969a[e0.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f118969a[e0.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f118969a[e0.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f118973a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f118974b = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f118975a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f118976b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f118977c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f118978d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f118979e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f118980f = 5;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f118981a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f118982b = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f118983a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f118984b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f118985c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f118986d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f118987e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f118988f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f118989g = "(2, 3, 5)";
    }

    @z2
    public static int a(androidx.work.a backoffPolicy) {
        int i10 = a.f118970b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @z2
    public static androidx.work.d b(byte[] bytes) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        IOException e10;
        androidx.work.d dVar = new androidx.work.d();
        if (bytes != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            dVar.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                        }
                    } catch (IOException e11) {
                        e10 = e11;
                        e10.printStackTrace();
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return dVar;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th2;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        throw th2;
                    }
                }
            } catch (IOException e14) {
                objectInputStream = null;
                e10 = e14;
            } catch (Throwable th4) {
                th2 = th4;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th2;
            }
            try {
                objectInputStream.close();
            } catch (IOException e15) {
                e15.printStackTrace();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e16) {
                e16.printStackTrace();
            }
        }
        return dVar;
    }

    @z2
    public static byte[] c(androidx.work.d triggers) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        if (triggers.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        try {
                            objectOutputStream2.writeInt(triggers.c());
                            for (androidx.work.d.a aVar : triggers.b()) {
                                objectOutputStream2.writeUTF(aVar.a().toString());
                                objectOutputStream2.writeBoolean(aVar.b());
                            }
                            objectOutputStream2.close();
                        } catch (IOException e10) {
                            e = e10;
                            objectOutputStream = objectOutputStream2;
                            e.printStackTrace();
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            byteArrayOutputStream.close();
                            return byteArrayOutputStream.toByteArray();
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream = objectOutputStream2;
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e12) {
                                e12.printStackTrace();
                                throw th;
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                } catch (IOException e14) {
                    e = e14;
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e15) {
            e15.printStackTrace();
        }
    }

    @z2
    public static androidx.work.a d(int value) {
        if (value == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (value == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @z2
    public static androidx.work.s e(int value) {
        if (value == 0) {
            return androidx.work.s.NOT_REQUIRED;
        }
        if (value == 1) {
            return androidx.work.s.CONNECTED;
        }
        if (value == 2) {
            return androidx.work.s.UNMETERED;
        }
        if (value == 3) {
            return androidx.work.s.NOT_ROAMING;
        }
        if (value == 4) {
            return androidx.work.s.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return androidx.work.s.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @NonNull
    @z2
    public static androidx.work.x f(int value) {
        if (value == 0) {
            return androidx.work.x.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return androidx.work.x.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @z2
    public static e0.a g(int value) {
        if (value == 0) {
            return e0.a.ENQUEUED;
        }
        if (value == 1) {
            return e0.a.RUNNING;
        }
        if (value == 2) {
            return e0.a.SUCCEEDED;
        }
        if (value == 3) {
            return e0.a.FAILED;
        }
        if (value == 4) {
            return e0.a.BLOCKED;
        }
        if (value == 5) {
            return e0.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    @z2
    public static int h(androidx.work.s networkType) {
        int i10 = a.f118971c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.s.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @z2
    public static int i(@NonNull androidx.work.x policy) {
        int i10 = a.f118972d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + policy + " to int");
    }

    @z2
    public static int j(e0.a state) {
        switch (a.f118969a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }
}
