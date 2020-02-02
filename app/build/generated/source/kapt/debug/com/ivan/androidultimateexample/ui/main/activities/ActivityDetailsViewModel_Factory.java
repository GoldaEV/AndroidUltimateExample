// Generated by Dagger (https://dagger.dev).
package com.ivan.androidultimateexample.ui.main.activities;

import com.ivan.todoengine.logic.task.ActivityLogic;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityDetailsViewModel_Factory implements Factory<ActivityDetailsViewModel> {
  private final Provider<ActivityLogic> activityLogicProvider;

  public ActivityDetailsViewModel_Factory(Provider<ActivityLogic> activityLogicProvider) {
    this.activityLogicProvider = activityLogicProvider;
  }

  @Override
  public ActivityDetailsViewModel get() {
    return newInstance(activityLogicProvider.get());
  }

  public static ActivityDetailsViewModel_Factory create(
      Provider<ActivityLogic> activityLogicProvider) {
    return new ActivityDetailsViewModel_Factory(activityLogicProvider);
  }

  public static ActivityDetailsViewModel newInstance(ActivityLogic activityLogic) {
    return new ActivityDetailsViewModel(activityLogic);
  }
}