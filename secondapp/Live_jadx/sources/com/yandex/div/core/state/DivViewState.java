package com.yandex.div.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class DivViewState {

    @NonNull
    private final Map<String, BlockState> mBlockStates;
    private final long mCurrentDivStateId;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface BlockState {
    }

    public DivViewState(long j10) {
        this(j10, new f0.a());
    }

    @Nullable
    public <T extends BlockState> T getBlockState(@NonNull String str) {
        return (T) this.mBlockStates.get(str);
    }

    @NonNull
    public Map<String, BlockState> getBlockStates() {
        return this.mBlockStates;
    }

    public long getCurrentDivStateId() {
        return this.mCurrentDivStateId;
    }

    public <T extends BlockState> void putBlockState(@NonNull String str, @NonNull T t10) {
        this.mBlockStates.put(str, t10);
    }

    public void reset() {
        this.mBlockStates.clear();
    }

    public DivViewState(long j10, @NonNull Map<String, BlockState> map) {
        this.mCurrentDivStateId = j10;
        this.mBlockStates = map;
    }
}
