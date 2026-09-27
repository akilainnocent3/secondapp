package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzed;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import k.h1;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@j0
public class MediaQueue {

    @h1
    long zza;

    @h1
    LruCache zzd;
    private final RemoteMediaClient zzh;

    @Nullable
    private PendingResult zzl;

    @Nullable
    private PendingResult zzm;
    private final Set zzn = Collections.synchronizedSet(new HashSet());
    private final Logger zzg = new Logger("MediaQueue");
    private final int zzi = Math.max(20, 1);

    @h1
    List zzb = new ArrayList();

    @h1
    final SparseIntArray zzc = new SparseIntArray();

    @h1
    final List zze = new ArrayList();

    @h1
    final Deque zzf = new ArrayDeque(20);
    private final Handler zzj = new zzed(Looper.getMainLooper());
    private final TimerTask zzk = new zzq(this);

    @h1
    public MediaQueue(RemoteMediaClient remoteMediaClient, int i10, int i11) {
        this.zzh = remoteMediaClient;
        remoteMediaClient.registerCallback(new zzs(this));
        zzt(20);
        this.zza = zzp();
        zzo();
    }

    public static /* bridge */ /* synthetic */ void zze(MediaQueue mediaQueue, int i10, int i11) {
        synchronized (mediaQueue.zzn) {
            try {
                Iterator it = mediaQueue.zzn.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).itemsInsertedInRange(i10, i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzf(MediaQueue mediaQueue, int[] iArr) {
        synchronized (mediaQueue.zzn) {
            try {
                Iterator it = mediaQueue.zzn.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).itemsRemovedAtIndexes(iArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(MediaQueue mediaQueue, List list, int i10) {
        synchronized (mediaQueue.zzn) {
            try {
                Iterator it = mediaQueue.zzn.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).itemsReorderedAtIndexes(list, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(final MediaQueue mediaQueue) {
        if (mediaQueue.zzf.isEmpty() || mediaQueue.zzl != null || mediaQueue.zza == 0) {
            return;
        }
        PendingResult pendingResultZzj = mediaQueue.zzh.zzj(CastUtils.zzf(mediaQueue.zzf));
        mediaQueue.zzl = pendingResultZzj;
        pendingResultZzj.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzp
            @Override // com.google.android.gms.common.api.ResultCallback
            public final void onResult(Result result) {
                this.zza.zzn((RemoteMediaClient.MediaChannelResult) result);
            }
        });
        mediaQueue.zzf.clear();
    }

    public static /* bridge */ /* synthetic */ void zzk(MediaQueue mediaQueue) {
        mediaQueue.zzc.clear();
        for (int i10 = 0; i10 < mediaQueue.zzb.size(); i10++) {
            mediaQueue.zzc.put(((Integer) mediaQueue.zzb.get(i10)).intValue(), i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzp() {
        MediaStatus mediaStatus = this.zzh.getMediaStatus();
        if (mediaStatus == null || mediaStatus.zzd()) {
            return 0L;
        }
        return mediaStatus.zzb();
    }

    private final void zzq() {
        this.zzj.removeCallbacks(this.zzk);
    }

    private final void zzr() {
        PendingResult pendingResult = this.zzm;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzm = null;
        }
    }

    private final void zzs() {
        PendingResult pendingResult = this.zzl;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzl = null;
        }
    }

    private final void zzt(int i10) {
        this.zzd = new zzr(this, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        synchronized (this.zzn) {
            try {
                Iterator it = this.zzn.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).mediaQueueChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        synchronized (this.zzn) {
            try {
                Iterator it = this.zzn.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).itemsReloaded();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(int[] iArr) {
        synchronized (this.zzn) {
            try {
                Iterator it = this.zzn.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).itemsUpdatedAtIndexes(iArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzx() {
        synchronized (this.zzn) {
            try {
                Iterator it = this.zzn.iterator();
                while (it.hasNext()) {
                    ((Callback) it.next()).mediaQueueWillChange();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzy() {
        zzq();
        this.zzj.postDelayed(this.zzk, 500L);
    }

    @NonNull
    public PendingResult<RemoteMediaClient.MediaChannelResult> fetchMoreItemsRelativeToIndex(int i10, int i11, int i12) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zza == 0) {
            return RemoteMediaClient.zzf(2100, "No active media session");
        }
        int iItemIdAtIndex = itemIdAtIndex(i10);
        return iItemIdAtIndex == 0 ? RemoteMediaClient.zzf(2001, "index out of bound") : this.zzh.zzh(iItemIdAtIndex, i11, i12);
    }

    @Nullable
    public MediaQueueItem getItemAtIndex(int i10) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return getItemAtIndex(i10, true);
    }

    public int getItemCount() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzb.size();
    }

    @NonNull
    public int[] getItemIds() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return CastUtils.zzf(this.zzb);
    }

    public int indexOfItemWithId(int i10) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzc.get(i10, -1);
    }

    public int itemIdAtIndex(int i10) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (i10 < 0 || i10 >= this.zzb.size()) {
            return 0;
        }
        return ((Integer) this.zzb.get(i10)).intValue();
    }

    public void registerCallback(@NonNull Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzn.add(callback);
    }

    public void setCacheCapacity(int i10) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        LruCache lruCache = this.zzd;
        ArrayList arrayList = new ArrayList();
        zzt(i10);
        int size = lruCache.size();
        for (Map.Entry entry : lruCache.snapshot().entrySet()) {
            if (size > i10) {
                int i11 = this.zzc.get(((Integer) entry.getKey()).intValue(), -1);
                if (i11 != -1) {
                    arrayList.add(Integer.valueOf(i11));
                }
            } else {
                this.zzd.put((Integer) entry.getKey(), (MediaQueueItem) entry.getValue());
            }
            size--;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        zzx();
        zzw(CastUtils.zzf(arrayList));
        zzu();
    }

    public void unregisterCallback(@NonNull Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzn.remove(callback);
    }

    public final void zzl() {
        zzx();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.evictAll();
        this.zze.clear();
        zzq();
        this.zzf.clear();
        zzr();
        zzs();
        zzv();
        zzu();
    }

    @h1
    public final void zzm(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.w(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzm = null;
        if (this.zzf.isEmpty()) {
            return;
        }
        zzy();
    }

    @h1
    public final void zzn(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.w(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzl = null;
        if (this.zzf.isEmpty()) {
            return;
        }
        zzy();
    }

    @h1
    public final void zzo() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zza != 0 && this.zzm == null) {
            zzr();
            zzs();
            PendingResult pendingResultZzi = this.zzh.zzi();
            this.zzm = pendingResultZzi;
            pendingResultZzi.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzo
                @Override // com.google.android.gms.common.api.ResultCallback
                public final void onResult(Result result) {
                    this.zza.zzm((RemoteMediaClient.MediaChannelResult) result);
                }
            });
        }
    }

    @Nullable
    public MediaQueueItem getItemAtIndex(int i10, boolean z10) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (i10 < 0 || i10 >= this.zzb.size()) {
            return null;
        }
        Integer num = (Integer) this.zzb.get(i10);
        num.intValue();
        MediaQueueItem mediaQueueItem = (MediaQueueItem) this.zzd.get(num);
        if (mediaQueueItem == null && z10 && !this.zzf.contains(num)) {
            while (deque.size() >= this.zzi) {
                this.zzf.removeFirst();
            }
            this.zzf.add(num);
            zzy();
        }
        return mediaQueueItem;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Callback {
        public void itemsReloaded() {
        }

        public void mediaQueueChanged() {
        }

        public void mediaQueueWillChange() {
        }

        public void itemsRemovedAtIndexes(@NonNull int[] iArr) {
        }

        public void itemsUpdatedAtIndexes(@NonNull int[] iArr) {
        }

        public void itemsInsertedInRange(int i10, int i11) {
        }

        public void itemsReorderedAtIndexes(@NonNull List<Integer> list, int i10) {
        }
    }
}
