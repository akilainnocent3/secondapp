package sg.bigo.ads.common.h.b;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f133107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f133108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f133109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f133110d;

    public d(Context context, a aVar) {
        this.f133110d = context;
        this.f133107a = aVar;
        sg.bigo.ads.common.h.a aVar2 = aVar.f133101b;
        this.f133109c = new File(aVar2.f133059c, sg.bigo.ads.common.utils.f.c(aVar2.f133060d));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    private void a() throws Throwable {
        long j10;
        int i10;
        String str = "the download file has a invalid size.";
        a("startDownloadTask");
        if (this.f133108b == null) {
            b("downloadStream is null");
            return;
        }
        this.f133107a.f133104e = h.f133118d;
        f.a().a(this.f133107a.f133100a);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f133108b);
        byte[] bArr = new byte[1048576];
        boolean z10 = false;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f133109c, "rwd");
            try {
                long j11 = this.f133107a.f133101b.f133063g;
                randomAccessFile2.seek(j11);
                j10 = 0;
                try {
                    sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, this.f133107a.f133100a + " startDownloadTask.");
                    while (true) {
                        int i11 = this.f133107a.f133104e;
                        i10 = h.f133118d;
                        if (i11 != i10) {
                            break;
                        }
                        int i12 = bufferedInputStream.read(bArr, 0, 1048576);
                        if (i12 == -1) {
                            if (j11 <= 0 || this.f133109c.length() != j11 || this.f133107a.f133104e != i10) {
                                break;
                            }
                            File file = this.f133109c;
                            sg.bigo.ads.common.h.a aVar = this.f133107a.f133101b;
                            file.renameTo(new File(aVar.f133059c, aVar.f133060d));
                            this.f133107a.f133104e = h.f133120f;
                            z10 = true;
                            f.a().a(this.f133107a.f133100a);
                            a("download is over.");
                            sg.bigo.ads.common.utils.g.a(randomAccessFile2);
                            sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                            sg.bigo.ads.common.utils.g.a((Closeable) this.f133108b);
                        }
                        randomAccessFile2.write(bArr, 0, i12);
                        j11 += (long) i12;
                        this.f133107a.b(j11);
                        f.a().a(this.f133107a.f133100a);
                    }
                    if (!q.a((CharSequence) "")) {
                        str = "";
                    } else if (this.f133107a.f133101b.f133063g > 0 && this.f133109c.length() > 0) {
                        str = this.f133107a.f133104e != i10 ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                    }
                    b("Failed to download due to: ".concat(str));
                    sg.bigo.ads.common.utils.g.a(randomAccessFile2);
                    sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                    sg.bigo.ads.common.utils.g.a((Closeable) this.f133108b);
                } catch (Exception e10) {
                    e = e10;
                    randomAccessFile = randomAccessFile2;
                    try {
                        String message = e.getMessage();
                        if (!z10) {
                            if (!q.a((CharSequence) message)) {
                                str = message;
                            } else if (this.f133107a.f133101b.f133063g > j10 && this.f133109c.length() > j10) {
                                str = this.f133107a.f133104e != h.f133118d ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                            }
                            b("Failed to download due to: ".concat(String.valueOf(str)));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f133108b);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!z10) {
                            if (q.a((CharSequence) "")) {
                                str = "";
                            } else if (this.f133107a.f133101b.f133063g > j10 && this.f133109c.length() > j10) {
                                if (this.f133107a.f133104e != h.f133118d) {
                                    str = "the download task error and download state is not loading.";
                                } else {
                                    str = "the download stream has not been read completely.";
                                }
                            }
                            b("Failed to download due to: ".concat(str));
                        }
                        sg.bigo.ads.common.utils.g.a(randomAccessFile);
                        sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                        sg.bigo.ads.common.utils.g.a((Closeable) this.f133108b);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    randomAccessFile = randomAccessFile2;
                    if (!z10) {
                        if (q.a((CharSequence) "")) {
                            str = "";
                        } else if (this.f133107a.f133101b.f133063g > j10) {
                            if (this.f133107a.f133104e != h.f133118d) {
                                str = "the download task error and download state is not loading.";
                            } else {
                                str = "the download stream has not been read completely.";
                            }
                        }
                        b("Failed to download due to: ".concat(str));
                    }
                    sg.bigo.ads.common.utils.g.a(randomAccessFile);
                    sg.bigo.ads.common.utils.g.a((Closeable) bufferedInputStream);
                    sg.bigo.ads.common.utils.g.a((Closeable) this.f133108b);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                j10 = 0;
            } catch (Throwable th4) {
                th = th4;
                j10 = 0;
            }
        } catch (Exception e12) {
            e = e12;
            j10 = 0;
        } catch (Throwable th5) {
            th = th5;
            j10 = 0;
        }
    }

    private void b(String str) {
        sg.bigo.ads.common.t.a.a(0, IDownloadTask.TAG, str + " , " + this.f133107a.f133100a + " has a error ! " + this.f133107a.toString());
        a aVar = this.f133107a;
        aVar.f133105f = str;
        aVar.f133104e = h.f133121g;
        f.a().a(this.f133107a.f133100a);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        while (true) {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(this.f133107a.f133101b.f133058b), this.f133107a.f133101b.f133073q, this.f133110d);
            aVar.f133349l = sg.bigo.ads.common.u.a.e.h();
            String str = "bytes=" + this.f133107a.f133101b.f133063g + TokenBuilder.TOKEN_DELIMITER;
            aVar.a("Range", str);
            a("Range = ".concat(String.valueOf(str)));
            sg.bigo.ads.common.u.c<sg.bigo.ads.common.u.c.a> cVarA = sg.bigo.ads.common.u.g.a(aVar);
            T t10 = cVarA.f133354a;
            if (t10 != 0) {
                sg.bigo.ads.common.u.c.b bVarA = sg.bigo.ads.common.u.c.b.a(((sg.bigo.ads.common.u.c.a) t10).a(kj.d.f102466f0));
                long jA = bVarA != null ? bVarA.f133362b : 0L;
                if (jA <= 0) {
                    jA = ((sg.bigo.ads.common.u.c.a) cVarA.f133354a).a();
                }
                this.f133107a.a(jA);
                T t11 = cVarA.f133354a;
                this.f133108b = ((sg.bigo.ads.common.u.c.a) t11).f133357b;
                this.f133107a.f133101b.f133072p = ((sg.bigo.ads.common.u.c.a) t11).a("Content-Type");
                if (!this.f133109c.exists()) {
                    break;
                }
                sg.bigo.ads.common.h.a aVar2 = this.f133107a.f133101b;
                long j10 = aVar2.f133063g;
                long j11 = bVarA != null ? bVarA.f133361a : 0L;
                if (j10 <= 0 || j10 != j11) {
                    a("Delete tmp file.");
                    if (!sg.bigo.ads.common.utils.f.a(this.f133109c)) {
                        b("Failed to delete temp file.");
                        return;
                    }
                    this.f133107a.b(0L);
                    if (j11 <= 0) {
                        break;
                    }
                    sg.bigo.ads.common.utils.g.a((Closeable) this.f133108b);
                    this.f133108b = null;
                } else {
                    aVar2.f133071o = true;
                }
                this.f133107a.f133104e = h.f133117c;
                f.a().a(this.f133107a.f133100a);
                a();
            }
            String str2 = "Failed to request url.";
            if (cVarA.f133355b != null) {
                str2 = "Failed to request url. Error code: " + cVarA.f133355b.f133373a + ", error msg: " + cVarA.f133355b.getMessage();
            }
            b(str2);
            return;
        }
        if (!sg.bigo.ads.common.utils.f.c(this.f133109c)) {
            b("Failed to create temp file.");
            return;
        }
        this.f133107a.f133104e = h.f133117c;
        f.a().a(this.f133107a.f133100a);
        a();
    }

    private void a(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, str + ",taskId=" + this.f133107a.f133100a + ", downloadinfo = " + this.f133107a.toString());
    }
}
