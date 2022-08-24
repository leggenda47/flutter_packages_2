# Copyright 2013 The Flutter Authors. All rights reserved.
# Use of this source code is governed by a BSD-style license that can be
# found in the LICENSE file.

if [ $# -eq 0 ]; then
  echo "usage: run.sh [android | ios]"
fi

dart run imitation_game --platform=$1
