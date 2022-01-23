#!/bin/bash

# Start postgres
/etc/init.d/postgresql start

# Start elixir server
export PATH=$PATH:"/root/.kiex/elixirs/elixir-1.3.1/bin/mix"
whereis mix
mix phoenix.server
