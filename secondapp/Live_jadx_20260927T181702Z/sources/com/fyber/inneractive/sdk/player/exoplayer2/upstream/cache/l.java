package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.media3.session.fe;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f46995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f46996b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f46998d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f47000f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46997c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f46999e = new HashMap();

    public l(File file, j jVar) {
        this.f46995a = file;
        this.f46996b = jVar;
        this.f46998d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized m a(String str, long j10) {
        String str2;
        m mVarA;
        try {
            a aVar = this.f47000f;
            if (aVar != null) {
                throw aVar;
            }
            h hVar = (h) this.f46998d.f46984a.get(str);
            if (hVar == null) {
                str2 = str;
                mVarA = new m(str2, j10, -1L, -9223372036854775807L, null);
            } else {
                str2 = str;
                while (true) {
                    mVarA = hVar.a(j10);
                    if (!mVarA.f46977d || mVarA.f46978e.length() == mVarA.f46976c) {
                        break;
                    }
                    a();
                }
            }
            if (!mVarA.f46977d) {
                if (this.f46997c.containsKey(str2)) {
                    return null;
                }
                this.f46997c.put(str2, mVarA);
                return mVarA;
            }
            h hVar2 = (h) this.f46998d.f46984a.get(str2);
            if (!hVar2.f46982c.remove(mVarA)) {
                throw new IllegalStateException();
            }
            int i10 = hVar2.f46980a;
            if (!mVarA.f46977d) {
                throw new IllegalStateException();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            File parentFile = mVarA.f46978e.getParentFile();
            long j11 = mVarA.f46975b;
            Pattern pattern = m.f47001g;
            File file = new File(parentFile, i10 + fe.F + j11 + fe.F + jCurrentTimeMillis + ".v3.exo");
            m mVar = new m(mVarA.f46974a, mVarA.f46975b, mVarA.f46976c, jCurrentTimeMillis, file);
            if (!mVarA.f46978e.renameTo(file)) {
                throw new a("Renaming of " + mVarA.f46978e + " to " + file + " failed.");
            }
            hVar2.f46982c.add(mVar);
            ArrayList arrayList = (ArrayList) this.f46999e.get(mVarA.f46974a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j jVar = (j) arrayList.get(size);
                    jVar.f46991a.remove(mVarA);
                    jVar.f46992b -= mVarA.f46976c;
                    jVar.f46991a.add(mVar);
                    jVar.f46992b += mVar.f46976c;
                    jVar.a(this, 0L);
                }
            }
            j jVar2 = this.f46996b;
            jVar2.f46991a.remove(mVarA);
            jVar2.f46992b -= mVarA.f46976c;
            jVar2.f46991a.add(mVar);
            jVar2.f46992b += mVar.f46976c;
            jVar2.a(this, 0L);
            return mVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.f46997c.remove(mVar.f46974a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[PHI: r4
      0x00d8: PHI (r4v6 java.io.DataInputStream) = (r4v3 java.io.DataInputStream), (r4v12 java.io.DataInputStream) binds: [B:55:0x00d6, B:40:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:89:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00fa, please report this as an issue */
    public static void a(l lVar) throws Throwable {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        File[] fileArrListFiles;
        m mVarA;
        if (!lVar.f46995a.exists()) {
            lVar.f46995a.mkdirs();
            return;
        }
        i iVar = lVar.f46998d;
        if (!iVar.f46989f) {
            DataInputStream dataInputStream3 = null;
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(iVar.f46986c.a());
                    dataInputStream = new DataInputStream(bufferedInputStream);
                    try {
                        if (dataInputStream.readInt() == 1) {
                            try {
                                if ((dataInputStream.readInt() & 1) != 0) {
                                    if (iVar.f46987d != null) {
                                        byte[] bArr = new byte[16];
                                        dataInputStream.readFully(bArr);
                                        try {
                                            iVar.f46987d.init(2, iVar.f46988e, new IvParameterSpec(bArr));
                                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, iVar.f46987d));
                                        } catch (InvalidAlgorithmParameterException e10) {
                                            e = e10;
                                            throw new IllegalStateException(e);
                                        } catch (InvalidKeyException e11) {
                                            e = e11;
                                            throw new IllegalStateException(e);
                                        }
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = iVar.f46986c;
                                    cVar.f47098a.delete();
                                    cVar.f47099b.delete();
                                    iVar.f46984a.clear();
                                    iVar.f46985b.clear();
                                    fileArrListFiles = lVar.f46995a.listFiles();
                                    if (fileArrListFiles == null) {
                                        return;
                                    }
                                    for (File file : fileArrListFiles) {
                                        if (!file.getName().equals("cached_content_index.exi")) {
                                            if (file.length() > 0) {
                                                mVarA = m.a(file, lVar.f46998d);
                                            } else {
                                                mVarA = null;
                                            }
                                            if (mVarA != null) {
                                                lVar.a(mVarA);
                                            } else {
                                                file.delete();
                                            }
                                        }
                                    }
                                    lVar.f46998d.a();
                                    lVar.f46998d.b();
                                    return;
                                }
                                if (iVar.f46987d != null) {
                                    iVar.f46989f = true;
                                }
                                int i10 = dataInputStream.readInt();
                                int i11 = 0;
                                for (int i12 = 0; i12 < i10; i12++) {
                                    int i13 = dataInputStream.readInt();
                                    String utf = dataInputStream.readUTF();
                                    h hVar = new h(i13, utf, dataInputStream.readLong());
                                    iVar.f46984a.put(utf, hVar);
                                    iVar.f46985b.put(i13, utf);
                                    int iHashCode = utf.hashCode();
                                    long j10 = hVar.f46983d;
                                    i11 += ((iHashCode + (i13 * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)));
                                }
                                if (dataInputStream.readInt() == i11) {
                                    z.a(dataInputStream);
                                } else {
                                    z.a(dataInputStream);
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar2 = iVar.f46986c;
                                    cVar2.f47098a.delete();
                                    cVar2.f47099b.delete();
                                    iVar.f46984a.clear();
                                    iVar.f46985b.clear();
                                }
                                fileArrListFiles = lVar.f46995a.listFiles();
                                if (fileArrListFiles == null) {
                                    return;
                                }
                                while (i < r3) {
                                    if (!file.getName().equals("cached_content_index.exi")) {
                                        if (file.length() > 0) {
                                            mVarA = m.a(file, lVar.f46998d);
                                        } else {
                                            mVarA = null;
                                        }
                                        if (mVarA != null) {
                                            lVar.a(mVarA);
                                        } else {
                                            file.delete();
                                        }
                                    }
                                }
                                lVar.f46998d.a();
                                lVar.f46998d.b();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                dataInputStream3 = dataInputStream;
                                dataInputStream2 = dataInputStream3;
                                if (dataInputStream2 != null) {
                                    z.a(dataInputStream2);
                                }
                                throw th;
                            }
                        }
                        z.a(dataInputStream);
                    } catch (FileNotFoundException unused) {
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                    } catch (IOException e12) {
                        e = e12;
                        Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (dataInputStream2 != null) {
                        z.a(dataInputStream2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                dataInputStream = null;
            } catch (IOException e13) {
                e = e13;
                dataInputStream = null;
            } catch (Throwable th4) {
                th = th4;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar3 = iVar.f46986c;
            cVar3.f47098a.delete();
            cVar3.f47099b.delete();
            iVar.f46984a.clear();
            iVar.f46985b.clear();
            fileArrListFiles = lVar.f46995a.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            while (i < r3) {
                if (!file.getName().equals("cached_content_index.exi")) {
                    if (file.length() > 0) {
                        mVarA = m.a(file, lVar.f46998d);
                    } else {
                        mVarA = null;
                    }
                    if (mVarA != null) {
                        lVar.a(mVarA);
                    } else {
                        file.delete();
                    }
                }
            }
            lVar.f46998d.a();
            lVar.f46998d.b();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(m mVar) {
        i iVar = this.f46998d;
        String str = mVar.f46974a;
        h hVarA = (h) iVar.f46984a.get(str);
        if (hVarA == null) {
            hVarA = iVar.a(str, -1L);
        }
        hVarA.f46982c.add(mVar);
        ArrayList arrayList = (ArrayList) this.f46999e.get(mVar.f46974a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f46991a.add(mVar);
                jVar.f46992b += mVar.f46976c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.f46996b;
        jVar2.f46991a.add(mVar);
        jVar2.f46992b += mVar.f46976c;
        jVar2.a(this, 0L);
    }

    public final void a(g gVar, boolean z10) throws Throwable {
        h hVar = (h) this.f46998d.f46984a.get(gVar.f46974a);
        if (hVar == null || !hVar.f46982c.remove(gVar)) {
            return;
        }
        gVar.f46978e.delete();
        if (z10 && hVar.f46982c.isEmpty()) {
            i iVar = this.f46998d;
            h hVar2 = (h) iVar.f46984a.remove(hVar.f46981b);
            if (hVar2 != null) {
                if (hVar2.f46982c.isEmpty()) {
                    iVar.f46985b.remove(hVar2.f46980a);
                    iVar.f46989f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f46998d.b();
        }
        ArrayList arrayList = (ArrayList) this.f46999e.get(gVar.f46974a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f46991a.remove(gVar);
                jVar.f46992b -= gVar.f46976c;
            }
        }
        j jVar2 = this.f46996b;
        jVar2.f46991a.remove(gVar);
        jVar2.f46992b -= gVar.f46976c;
    }

    public final void a() throws Throwable {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f46998d.f46984a.values().iterator();
        while (it.hasNext()) {
            for (g gVar : ((h) it.next()).f46982c) {
                if (gVar.f46978e.length() != gVar.f46976c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.f46998d.a();
        this.f46998d.b();
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.f46998d.f46984a.get(str);
        return hVar == null ? -1L : hVar.f46983d;
    }
}
